package db;

/**
 * Description of PaysDAO  
 *
 * @author lesommer
 */
class PaysDAO implements DataAccessObject{



    private static PaysDAO dao;
    
    
    private PaysDAO() {    }
    
   
    public final static PaysDAO getInstance() {
        if(this.dao == null) {
            this.dao= new PaysDAO();
        }
        return this.dao;
    }
    
    

   private final void insertPr(Pays pays, SQliteConnexion dbc){

	        String query = "insert into Pays(nom) values "+pays.getNom();
	        super.statement(dbc,query);

    }
    
    
    private void deletePr(Pays pays, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Pays WHERE nom="+pays.getNom();
	        super.statement(dbc,query);

     
      }
     
	private void updatePr(Pays pays, SQliteConnexion dbc){
	

	        String query = "UPDATE Pays SET nom="+pays.getNom()+" WHERE nom="+pays.getNom();
	        super.statement(dbc,query);
	
	}
	
}

