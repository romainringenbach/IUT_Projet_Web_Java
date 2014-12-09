package db;

/**
 * Description of CommandeDAO  
 *
 * @author lesommer
 */
class CommandeDAO implements DataAccessObject{


	
    private static CommandeDAO dao;
    
    
    private CommandeDAO() {    }
    
   
    public final static CommandeDAO getInstance() {
        if(this.dao == null) {
            this.dao= new CommandeDAO();
        }
        return this.dao;
    }
    
    

   private final void insertPr(Commande commande, SQliteConnexion dbc){

	        String query = "insert into Commande(id_titre, loginClient, date) values ("+commande.getIdTitre()+","+ commande.getLoginClient()+","+ commande.getDate()+")" ;
	        super.statement(dbc,query);

    }
    
    
    private void deletePr(Commande commande, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Commande WHERE loginClient="+commande.getLoginClient()+" AND id_titre="+commande.getIdTitre() ;
	        super.statement(dbc,query);

     
      }
     
	private void updatePr(Commande commande, SQliteConnexion dbc){
			
	        
	
	}

	
}
