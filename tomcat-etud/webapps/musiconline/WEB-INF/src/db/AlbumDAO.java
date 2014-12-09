package db;

import db.*;
/**
 * Description of AlbumDAO  
 *
 * @author lesommer
 */

class AlbumDAO extends DataAccesObject{



    private static AlbumDAO dao;
    
    
    private AlbumDAO() {    }
    
   
    public final static AlbumDAO getInstance() {
        if(this.dao == null) {
            this.dao= new AlbumDAO();
        }
        return this.dao;
    }
    
    

   private final void insertPr(Album album, SQliteConnexion dbc){

	        String query = "insert into Album(nom) values "+album.getNom();
	        super.statement(dbc,query);

    }
    
    
    private void deletePr(Album album, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Album WHERE id_album="+album.getId();
	        super.statement(dbc,query);

     
      }
     
	private void updatePr(Album album, SQliteConnexion dbc){
	

	        String query = "UPDATE Album SET nom="+album.getNom()+" WHERE id_album="+album.getId();
	        super.statement(dbc,query);
	
	}
	
	
}
