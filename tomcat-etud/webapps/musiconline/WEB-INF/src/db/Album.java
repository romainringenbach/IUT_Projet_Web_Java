package db;

import db.DataObject;

/**
 * Description of Album
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	class Album implements DataObject{

	 	private String nom;
	 	private int id;
		
		public void Album(){
		
		}
		
		public void init(idi, name){
			
				this.nom = name;
				this.id = idi;
		}
		
		public String getNom(){
		
			return this.nom;
		}
	
			
		public void setNom(name){
		
			this.nom = name;
		}
		
		public int getId(){
		
			return this.id;
		}
	
			
		public void setId(idi){
		
			this.id = idi;
		}


	}
