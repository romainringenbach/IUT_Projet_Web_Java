package db;

/**
 * Description of ArtisteDAO  
 *
 * @author lesommer
 */
class ArtisteDAO implements DataAccessObject{


    private static ArtisteDAO dao;
    
    
    private ArtisteDAO() {    }
    
   
    public final static ArtisteDAO getInstance() {
        if(this.dao == null) {
            this.dao= new ArtisteDAO();
        }
        return this.dao;
    }
    
    

   private final void insertPr(Artiste artiste, SQliteConnexion dbc){

	        String query = "insert into Artiste(nom) values "+artiste.getNom();
	        super.statement(dbc,query);

    }
    
    
    private void deletePr(Artiste artiste, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Artiste WHERE id_artiste="+artiste.getId();
	        super.statement(dbc,query);

     
      }
     
	private void updatePr(Artiste artiste, SQliteConnexion dbc){
	

	        String query = "UPDATE Artiste SET nom="+artiste.getNom()+" WHERE id_artiste="+artiste.getId();
	        super.statement(dbc,query);
	
	}


}

