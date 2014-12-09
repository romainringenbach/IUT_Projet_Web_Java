package db;

/**
 * Description of CategorieDAO  
 *
 * @author lesommer
 */
class CategorieDAO implements DataAccessObject{


    private static CategorieDAO dao;
    
    
    private CategorieDAO() {    }
    
   
    public final static CategorieDAO getInstance() {
        if(this.dao == null) {
            this.dao= new CategorieDAO();
        }
        return this.dao;
    }
    
    

   private final void insertPr(Categorie categorie, SQliteConnexion dbc){

	        String query = "insert into Categorie(nom) values "+categorie.getNom();
	        super.statement(dbc,query);

    }
    
    
    private void deletePr(Categorie categorie, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Categorie WHERE nom="+categorie.getNom();
	        super.statement(dbc,query);

     
      }
     
	private void updatePr(Categorie categorie, SQliteConnexion dbc){
	

	        String query = "UPDATE Categorie SET nom="+categorie.getNom()+" WHERE nom="+categorie.getNom();
	        super.statement(dbc,query);
	
	}

	
}

