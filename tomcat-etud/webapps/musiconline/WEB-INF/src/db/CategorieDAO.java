package db;

import java.sql.*;
/**
 * Description of CategorieDAO  
 *
 * @author lesommer
 */
public class CategorieDAO extends DataAccessObject{


    private static CategorieDAO dao;
    
    
    private CategorieDAO() {    }
    
   
    public static CategorieDAO getInstance() {
        if(dao == null) {
            dao= new CategorieDAO();
        }
        return dao;
    }
    
    

   public void insertPr(DataObject data, java.sql.Connection dbc) throws SQLException{


		Categorie categorie = (Categorie) data;
	        String query = "insert into Categorie(nom) values "+categorie.getNom();
	        super.statement(dbc,query);

    }
    

    public void deletePr(DataObject data, java.sql.Connection dbc) throws SQLException{
     	
		Categorie categorie = (Categorie) data;
	        String query = "DELETE FROM Categorie WHERE nom="+categorie.getNom();
	        super.statement(dbc,query);

     
      }
     
	public void updatePr(DataObject data, java.sql.Connection dbc) throws SQLException{

		Categorie categorie = (Categorie) data;	
	        String query = "UPDATE Categorie SET nom="+categorie.getNom()+" WHERE nom="+categorie.getNom();
	        super.statement(dbc,query);
	
	}

	
}

