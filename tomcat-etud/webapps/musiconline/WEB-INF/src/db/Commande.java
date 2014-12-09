package db;

import db.DataObject;


/**
 * Description of Commande
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	public class Commande implements DataObject{

	 	private int  idTitre;
	 	private String loginClient ;
	 	private String date;
		
	
		public Commande(int idT, String log, String date){
			
				this.idTitre = idT;
				this.loginClient = log;
				this.date = date;
		}
		
		public int getIdTitre(){
		
			return this.idTitre;
		}
	
			
		public void setIdTitre(int idT){
		
			this.idTitre = idT;
		}
		
		public String getLoginClient(){
		
			return this.loginClient;
		}
	
			
		public void setLoginClient(String log){
		
			this.loginClient = log;
		}
		
		public String getDate(){
		
			return this.date;
		}
	
			
		public void setDate(String date){
		
			this.date = date;
		}


	}

