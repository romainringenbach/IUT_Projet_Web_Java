package db;

import db.DataObject;

/**
 * Description of Album
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	public class Album implements DataObject{

	 	private String nom;
	 	private int id;
		

		public Album(int idi,String name){
			
				this.nom = name;
				this.id = idi;
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


	}
