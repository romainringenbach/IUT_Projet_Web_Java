package db;

import db.DataObject;


/**
 * Description of Pays
 *
 * @author ledoux-levin simon / ringenbach romain
 */
	public class Pays implements DataObject{

	 	private String nom;
		
	
		public Pays(String name){
			
				this.nom = name;
				
		}
		
		public String getNom(){
		
			return this.nom;
		}
	
			
		public void setNom(String name){
		
			this.nom = name;
		}

	}

			
		
		
		
