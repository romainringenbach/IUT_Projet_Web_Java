package db;

import db.DataObject;


/**
 * Description of Commande
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	public class Commande extends DataObject{

	 	private int  idTitre;
	 	private String loginClient ;
	 	private String date;
		
	
		public Commande(int idT, String log, String date){
			
				super();
				this.idTitre = idT;
				this.loginClient = stringQuote(log);
				this.date = stringQuote(date);
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
		
			this.loginClient = stringQuote(log);
		}
		
		public String getDate(){
		
			return this.date;
		}
	
			
		public void setDate(String date){
		
			this.date = stringQuote(date);
		}


	}

