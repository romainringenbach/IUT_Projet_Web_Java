package db;

/**
 * Description of CommandeDAO  
 *
 * @author lesommer
 */
public class CommandeDAO implements DataAccessObject{


	
    private static CommandeDAO dao;
    
    
    private CommandeDAO() {    }
    
   
    public final static CommandeDAO getInstance() {
        if(dao == null) {
            dao= new CommandeDAO();
        }
        return dao;
    }
    
    

   public final void insertPr(Commande commande, SQliteConnexion dbc){

	        String query = "insert into Commande(id_titre, loginClient, date) values ("+commande.getIdTitre()+","+ commande.getLoginClient()+","+ commande.getDate()+")" ;
	        super.statement(dbc,query);

    }
    
    
    public void deletePr(Commande commande, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Commande WHERE loginClient="+commande.getLoginClient()+" AND id_titre="+commande.getIdTitre() ;
	        super.statement(dbc,query);

     
      }
     
	public void updatePr(Commande commande, SQliteConnexion dbc){
			
	        
	
	}

	
}
