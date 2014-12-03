package db;

import db.*;
/**
 * Description of AlbumDAO  
 *
 * @author lesommer
 */

class AlbumDAO extends DAO{



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
	        statement(dbc,query);

    }
    
    
    private void deletePr(Album album, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Album WHERE id_album="+album.getId();
	        statement(dbc,query);

     
      }
     
	private void updatePr(Album album, SQliteConnexion dbc){
	

	        String query = "UPDATE Album SET nom="+album.getNom()+" WHERE id_album="+album.getId();
	        statement(dbc,query);
	
	}
	
	
}
