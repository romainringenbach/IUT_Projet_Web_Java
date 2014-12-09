package db;

import db.*;
/**
 * Description of AlbumDAO  
 *
 * @author lesommer
 */

public class AlbumDAO extends DataAccessObject{



    private static AlbumDAO dao;
    
    
    private AlbumDAO() {    }
    
   
    public final static AlbumDAO getInstance() {
        if(dao == null) {
            dao= new AlbumDAO();
        }
        return dao;
    }
    
    

   public void insertPr(Album album, SQliteConnexion dbc){

	        String query = "insert into Album(nom) values "+album.getNom();
	        super.statement(dbc,query);

    }
    
    
   public void deletePr(Album album, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Album WHERE id_album="+album.getId();
	        super.statement(dbc,query);

     
      }
     
	 public void updatePr(Album album, SQliteConnexion dbc){
	

	        String query = "UPDATE Album SET nom="+album.getNom()+" WHERE id_album="+album.getId();
	        super.statement(dbc,query);
	
	}
	
	
}
