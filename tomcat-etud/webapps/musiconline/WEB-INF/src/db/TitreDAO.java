package db;

import java.sql.*;
import java.util.*;
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

	public ResultSet findSomeMusic(){

		ResultSet res = null;
		
		try{
			String query = "SELECT titre.nom, album.nom, artiste.nom, categorie, prix FROM titre, album, artiste WHERE titre.album = album.id_album AND titre.artiste = artiste.id_artiste";
			Connection connexion = SQliteConnexion.getInstance().getConnection();
			System.out.println(query);
			res = connexion.prepareStatement(query).executeQuery();
			
		}
		catch(SQLException ex){
			System.out.println("Erreur lors de la requete SQL");
			res = null;
		}
		return res;
	}



	public ResultSet findCatMusic(String cat){

		ResultSet res = null;
		
		try{
			String query = "SELECT titre.nom, album.nom, artiste.nom, categorie, prix FROM titre, album, artiste WHERE titre.album=album.id_album AND titre.artiste=artiste.id_artiste AND categorie='"+cat.toString()+"'";
			Connection connexion = SQliteConnexion.getInstance().getConnection();
			System.out.println(query);
			res = connexion.prepareStatement(query).executeQuery();
			
		}
		catch(SQLException ex){
			System.out.println("Erreur lors de la requete SQL");
			res = null;
		}
		return res;
	}

	public ArrayList<Titre> findSomeByAlbum(String[] idList) throws SQLException{



		ArrayList<Titre> ret = new ArrayList<Titre>();

    	Connection dbc = this.connexion().getConnection();	
		String query;
		Statement stmt;
		ResultSet rs ;
		int id;

		for (i = 0; i < idList.length ; i++ ) {
			
			id = (int) idList[i];



			query = "SELECT titre.nom, album.nom, artiste.nom, categorie, prix FROM titre, album, artiste WHERE titre.album=album.id_album AND titre.artiste=artiste.id_artiste AND id_titre = '" + id "'";

			stmt = dbc.createStatement();

			rs = stmt.executeQuery(query);

			while(rs.next()){

		 		int idi = rs.getInt(1);
		 		String nom = rs.getNString(2);
		 		int album = rs.getInt(3);
		 		int artiste = rs.getInt(4);
		 		String categorie = rs.getNString(5);
		 		int prix = rs.getInt(6);

		 		ret.add(new Titre( idi, name, album, artiste, categorie, prix);
		 	}		

		}

		return ret;

	}	
	
}
 
