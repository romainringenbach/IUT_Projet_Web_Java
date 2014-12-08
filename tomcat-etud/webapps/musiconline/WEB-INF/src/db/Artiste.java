package db;

import db.DataObject;

/**
 * Description of Artiste
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	class Artiste implements DataObject{

	 	private String nom;
	 	private int id;
		
		public Artiste(){
		
		}
		
		public void init(int idi, String name){
			
				this.nom = name;
				this.id = idi;
		}
		
		public String  getNom(){
		
			return this.nom;
		}
	
			
		public void setNom(String name){
		
			this.nom = name;
		}
		
		public int  getId(){
		
			return this.id;
		}
	
			
		public void setId(int idi){
		
			this.id = idi;
		}


	}