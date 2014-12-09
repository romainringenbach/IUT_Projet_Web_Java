package db;

import db.DataObject;


/**
 * Description of Titre
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	public class Titre implements DataObject{

	 	private int id;
	 	private String nom;
	 	private int album;
	 	private int artiste;
	 	private String categorie;
	 	private int prix;
	 	
	
		public Titre(int idi,String name,int album,int artiste,String categorie,int prix){
			
				this.id = idi;
				this.nom = name;
				this.album =album;
				this.artiste =artiste;
				this.categorie =categorie;
				this.prix =prix;
		}
		
		public String getNom(){
		
			return this.nom;
		}
	
			
		public void setNom(String name){
		
			this.nom = name;
		}
		
		public int getId(){
		
			return this.id;
		}
	
			
		public void setId(int idi){
		
			this.id = idi;
		}
		
		public int getAlbum(){
		
			return this.album;
		}
	
			
		public void setAlbum(int album){
		
			this.album = album;
		}
		
		public int getArtiste(){
		
			return this.artiste;
		}
	
			
		public void setArtiste(int artiste){
		
			this.artiste = artiste;
		}
		
		public String getCategorie(){
		
			return this.categorie;
		}
	
			
		public void setCategorie(String categorie){
		
			this.categorie= categorie;
		}
		
		public int getPrix(){
		
			return this.prix;
		}
	
			
		public void setPrix(int prix){
		
			this.prix = prix;
		}


	}

