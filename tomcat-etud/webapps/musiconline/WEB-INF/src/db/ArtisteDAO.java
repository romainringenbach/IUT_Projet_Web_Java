package db;

import java.sql.*;
/**
 * Description of ArtisteDAO  
 *
 * @author lesommer
 */
public class ArtisteDAO extends DataAccessObject{

    private static ArtisteDAO dao;
    
    private ArtisteDAO() {    }
    
    public static ArtisteDAO getInstance() {
        if(dao == null) {
            dao= new ArtisteDAO();
        }
        return dao;
    }

   public  void insertPr(DataObject data, java.sql.Connection dbc)  throws SQLException{


		Artiste artiste = (Artiste) data;
	        String query = "insert into Artiste(nom) values "+artiste.getNom();
	        super.statement(dbc,query);
    }
    
    
    public void deletePr(DataObject data, java.sql.Connection dbc)  throws SQLException{
     
		Artiste artiste = (Artiste) data;	
	        String query = "DELETE FROM Artiste WHERE id_artiste="+artiste.getId();
	        super.statement(dbc,query);
      }
     
	public void updatePr(DataObject data, java.sql.Connection dbc)  throws SQLException{
	
		Artiste artiste = (Artiste) data;
	        String query = "UPDATE Artiste SET nom="+artiste.getNom()+" WHERE id_artiste="+artiste.getId();
	        super.statement(dbc,query);
	}


}

