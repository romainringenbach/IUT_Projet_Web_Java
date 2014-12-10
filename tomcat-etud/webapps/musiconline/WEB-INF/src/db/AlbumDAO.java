package db;

import db.*;
import java.sql.*;
/**
 * Description of AlbumDAO  
 *
 * @author lesommer
 */

public class AlbumDAO extends DataAccessObject{



    private static AlbumDAO dao;
    
    
    private AlbumDAO() {    }
    
   
    public static AlbumDAO getInstance() {
        if(dao == null) {
            dao= new AlbumDAO();
        }
        return dao;
    }
    
    

   public void insertPr(DataObject data, java.sql.Connection dbc) throws SQLException{

		Album album =(Album) data;
	        String query = "insert into Album(nom) values "+album.getNom();
	        super.statement(dbc,query);

    }
    
    
   public void deletePr(DataObject data, java.sql.Connection dbc) throws SQLException{
     	
		Album album =(Album) data;
	        String query = "DELETE FROM Album WHERE id_album="+album.getId();
	        super.statement(dbc,query);

     
      }
     
	 public void updatePr(DataObject data, java.sql.Connection dbc) throws SQLException{
	
		Album album =(Album) data;
	        String query = "UPDATE Album SET nom="+album.getNom()+" WHERE id_album="+album.getId();
	        super.statement(dbc,query);
	
	}
	
	
}
