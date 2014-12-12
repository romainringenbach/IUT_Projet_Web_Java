package db;

import db.DataObject;


/**
 * Description of Pays
 *
 * @author ledoux-levin simon / ringenbach romain
 */
	public class Pays extends DataObject{

	 	private String nom;
		
	
		public Pays(String name){
			
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

			
		
		
		
