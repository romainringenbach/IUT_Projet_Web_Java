package db;

/**
 * Description of CategorieDAO  
 *
 * @author lesommer
 */
public class CategorieDAO implements DataAccessObject{


    private static CategorieDAO dao;
    
    
    private CategorieDAO() {    }
    
   
    public final static CategorieDAO getInstance() {
        if(dao == null) {
            dao= new CategorieDAO();
        }
        return dao;
    }
    
    

   public final void insertPr(Categorie categorie, SQliteConnexion dbc){

	        String query = "insert into Categorie(nom) values "+categorie.getNom();
	        super.statement(dbc,query);

    }
    
    
    public void deletePr(Categorie categorie, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Categorie WHERE nom="+categorie.getNom();
	        super.statement(dbc,query);

     
      }
     
	public void updatePr(Categorie categorie, SQliteConnexion dbc){
	

	        String query = "UPDATE Categorie SET nom="+categorie.getNom()+" WHERE nom="+categorie.getNom();
	        super.statement(dbc,query);
	
	}

	
}

