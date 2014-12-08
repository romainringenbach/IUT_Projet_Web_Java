package db;

import db.DataObject;
/**
 * Description of Categorie
 *
 * @author ledoux-levin simon / ringenbach romain
 */
	class Categorie implements DataObject{

	 	private String nom;
		
		public Categorie(){
		
		}
		
		public String init(String name){
			
				this.nom = name;
				
		}
		
		public String getNom(){
		
			return this.nom;
		}
	
			
		public void setNom(String name){
		
			this.nom = name;
		}

	}
		
		
		
		