package db;

import db.DataObject;


/**
 * Description of Pays
 *
 * @author ledoux-levin simon / ringenbach romain
 */
	class Pays implements DataObject{

	 	private nom;
		
		public Pays(){
		
		}
		
		public void init(String name){
			
				this.nom = name;
				
		}
		
		public String getNom(){
		
			return this.nom;
		}
	
			
		public void setNom(String name){
		
			this.nom = name;
		}

	}

			
		
		
		