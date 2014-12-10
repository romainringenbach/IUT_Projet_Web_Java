package db;

import java.sql.*;

/**
 * Description of CommandeDAO  
 *
 * @author lesommer
 */
public class CommandeDAO extends DataAccessObject{


    private static CommandeDAO dao;
    
    
    private CommandeDAO() {    }
    
   
    public static CommandeDAO getInstance() {
        if(dao == null) {
            dao= new CommandeDAO();
        }
        return dao;
    }
    
    

   public final void insertPr(DataObject data, java.sql.Connection dbc) throws SQLException{


		Commande commande = (Commande) data;
	        String query = "insert into Commande(id_titre, loginClient, date) values ("+commande.getIdTitre()+","+ commande.getLoginClient()+","+ commande.getDate()+")" ;
	        super.statement(dbc,query);

    }
    
    
    public void deletePr(DataObject data, java.sql.Connection dbc) throws SQLException{
     	
		Commande commande = (Commande) data;
	        String query = "DELETE FROM Commande WHERE loginClient="+commande.getLoginClient()+" AND id_titre="+commande.getIdTitre() ;
	        super.statement(dbc,query);

     
      }
     
	public void updatePr(DataObject data, java.sql.Connection dbc) throws SQLException{
			
	        Commande commande = (Commande) data;
	
	}

	
}
