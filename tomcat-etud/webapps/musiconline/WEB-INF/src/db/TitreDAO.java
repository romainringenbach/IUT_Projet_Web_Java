package db;
/**
 * Description of TitreDAO  
 *
 * @author lesommer
 */
class TitreDAO implements DataAccessObject{



    private static TitreDAO dao;
    
    
    private TitreDAO() {    }
    
   
    public final static TitreDAO getInstance() {
        if(this.dao == null) {
            this.dao= new TitreDAO();
        }
        return this.dao;
    }
    
    

   private final void insertPr(Titre titre, SQliteConnexion dbc){

	        String query = "INSERT INTO Titre(nom, album, artiste, categorie, prix) VALUE ("+titre.getNom()+"," +titre.getAlbum()+"," +titre.getArtiste()+","+ titre.getCategorie()+"," +titre.getPrix()+")" ;
	        super.statement(dbc,query);

    }
    
    
    private void deletePr(Titre titre, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Titre WHERE id_titre="+titre.getId() ;
	        super.statement(dbc,query);

     
      }
     
	private void updatePr(Titre titre, SQliteConnexion dbc){
			
	        String query = "UPDATE Titre SET nom="+titre.getNom()+", album="+titre.getAlbum()+", artiste="+titre.getArtiste()+", categorie="+titre.getCategorie()+", prix="+titre.getPrix()+" WHERE id_titre="+titre.getId();
	        super.statement(dbc,query);
	
	}


	
}
 
