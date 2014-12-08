package db;

import db.DataObject;


/**
 * Description of Client
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	class Client implements DataObject{

	 	private String login;
	 	private String email;
	 	private String passwd;
	 	private String nom;
	 	private String prenom;
	 	private String dateNaissance;
	 	private String adresse ;
	  	private int code_postal;
	 	private String ville;
	 	private String pays ;
	 	
		
		public  Client(){
		
		}
		
		public void init(String login, String email, String passwd, String nom, String prenom, String dateNaissance, String adresse, int code_postal, String ville, String pays){
			
				this.login = login;
				this.email = email;
				this.passwd =passwd;
				this.nom =nom;
				this.prenom =prenom;
				this.date_naissance =dateNaissance;
				this.adresse =adresse;
				this.code_postal =code_postal;
				this.ville =ville;
				this.pays =pays;
		}
		
		public String getLogin(){
		
			return this.login;
		}
	
			
		public void setLogin(String login){
		
			this.login = login;
		}
		
		public String getEmail(){
		
			return this.email;
		}
	
			
		public void setEmail(String email){
		
			this.email = email;
		}
		
		public String getPassword(){
		
			return this.passwd;
		}
	
			
		public void setPassword(String password){
		
			this.passwd = password;
		}
		
		public String getNom(){
		
			return this.nom;
		}
	
			
		public void setNom(String name){
		
			this.nom = name;
		}
		
		public String getPrenom(){
		
			return this.prenom;
		}
	
			
		public void setPrenom(String prenom){
		
			this.prenom= prenom;
		}
		
		public String getDateNaissance(){
		
			return this.date_naissance;
		}
	
			
		public void setDateNaissance(String date){
		
			this.date_naissance = date;
		}
		
		public String getAdresse(){
	
			return this.adresse;
		}
	
			
		public void setAdresse(String adresse){
		
			this.adresse= adresse;
		}
		
		public int getCodePostal(){
		
			return this.code_postal;
		}
	
			
		public void setCodePostal(int code){
		
			this.code_postal= code;
		}

		public String getVille(){
		
			return this.ville;
		}
	
			
		public void setVille(String ville){
		
			this.ville= ville;
		}
		
		
		public String getPays(){
		
			return this.pays;
		}
	
			
		public void setPays(String pays){
		
			this.pays = pays;
		}

	}