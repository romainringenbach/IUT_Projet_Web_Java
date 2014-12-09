package db;

/**
 * Description of ArtisteDAO  
 *
 * @author lesommer
 */
public class ArtisteDAO implements DataAccessObject{


    private static ArtisteDAO dao;
    
    
    private ArtisteDAO() {    }
    
   
    public final static ArtisteDAO getInstance() {
        if(dao == null) {
            dao= new ArtisteDAO();
        }
        return dao;
    }
    
    

   public final void insertPr(Artiste artiste, SQliteConnexion dbc){

	        String query = "insert into Artiste(nom) values "+artiste.getNom();
	        super.statement(dbc,query);

    }
    
    
    public void deletePr(Artiste artiste, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Artiste WHERE id_artiste="+artiste.getId();
	        super.statement(dbc,query);

     
      }
     
	public void updatePr(Artiste artiste, SQliteConnexion dbc){
	

	        String query = "UPDATE Artiste SET nom="+artiste.getNom()+" WHERE id_artiste="+artiste.getId();
	        super.statement(dbc,query);
	
	}


}

