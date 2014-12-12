package db;

import db.DataObject;
/**
 * Description of Categorie
 *
 * @author ledoux-levin simon / ringenbach romain
 */
	public class Categorie extends DataObject{

	 	private String nom;
		
		public Categorie(String name){
			
				super();
				this.nom = stringQuote(name);
				
		}
		
		public String getNom(){
		
			return this.nom;
		}
	
			
		public void setNom(String name){
		
			this.nom = stringQuote(name);
		}

	}
		
		
		
		