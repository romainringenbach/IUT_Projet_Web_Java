package db;

import java.sql.*;
/**
 * Description of TitreDAO  
 *
 * @author lesommer
 */
public class TitreDAO extends DataAccessObject{



    private static TitreDAO dao;
    
    
    private TitreDAO() {}
    
   
    public static TitreDAO getInstance() {
        if(dao == null) {
            dao = new TitreDAO();
        }
        return dao;
    }
    
    

   public final void insertPr(DataObject data, java.sql.Connection dbc) throws SQLException{

		Titre titre = (Titre) data;

	        String query = "INSERT INTO Titre(nom, album, artiste, categorie, prix) VALUE ("+titre.getNom()+"," +titre.getAlbum()+"," +titre.getArtiste()+","+ titre.getCategorie()+"," +titre.getPrix()+")" ;
	        super.statement(dbc,query);

    }
    
    
    public void deletePr(DataObject data, java.sql.Connection  dbc) throws SQLException{
     	
		Titre titre = (Titre) data;
	        String query = "DELETE FROM Titre WHERE id_titre="+titre.getId() ;
	        super.statement(dbc,query);

     
      }
     
	public void updatePr(DataObject data, java.sql.Connection  dbc) throws SQLException{
			
		Titre titre = (Titre) data;
	        String query = "UPDATE Titre SET nom="+titre.getNom()+", album="+titre.getAlbum()+", artiste="+titre.getArtiste()+", categorie="+titre.getCategorie()+", prix="+titre.getPrix()+" WHERE id_titre="+titre.getId();
	        super.statement(dbc,query);
	
	}


	
}
 
