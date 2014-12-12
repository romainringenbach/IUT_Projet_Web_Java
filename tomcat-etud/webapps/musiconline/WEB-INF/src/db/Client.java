package db;

import db.DataObject;


/**
 * Description of Client
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	public class Client extends DataObject{

	 	private String login;
	 	private String email;
	 	private String passwd;
	 	private String nom;
	 	private String prenom;
	 	private String dateNaissance;
	 	private String adresse ;
	  	private String code_postal;
	 	private String ville;
	 	private String pays ;
	 	
		
		public Client(String login, String email, String passwd, String nom, String prenom, String dateNaissance, String adresse, String code_postal, String ville, String pays){
			
				super();
				this.login = stringQuote( login);
				this.email = stringQuote( email);
				this.passwd = stringQuote(passwd);
				this.nom = stringQuote(nom);
				this.prenom = stringQuote(prenom);
				this.dateNaissance = stringQuote(dateNaissance);
				this.adresse = stringQuote(adresse);
				this.code_postal = stringQuote(code_postal);
				this.ville = stringQuote(ville);
				this.pays = stringQuote(pays);
		}
		
		public String getLogin(){
		
			return this.login;
		}
	
			
		public void setLogin(String login){
		
			this.login = stringQuote(login);
		}
		
		public String getEmail(){
		
			return this.email;
		}
	
			
		public void setEmail(String email){
		
			this.email = stringQuote(email);
		}
		
		public String getPassword(){
		
			return this.passwd;
		}
	
			
		public void setPassword(String password){
		
			this.passwd = stringQuote(password);
		}
		
		public String getNom(){
		
			return this.nom;
		}
	
			
		public void setNom(String name){
		
			this.nom = stringQuote(name);
		}
		
		public String getPrenom(){
		
			return this.prenom;
		}
	
			
		public void setPrenom(String prenom){
		
			this.prenom= stringQuote(prenom);
		}
		
		public String getDateNaissance(){
		
			return this.dateNaissance;
		}
	
			
		public void setDateNaissance(String date){
		
			this.dateNaissance = stringQuote(date);
		}
		
		public String getAdresse(){
	
			return this.adresse;
		}
	
			
		public void setAdresse(String adresse){
		
			this.adresse= stringQuote(adresse);
		}
		
		public String getCodePostal(){
		
			return this.code_postal;
		}
	
			
		public void setCodePostal(String code){
		
			this.code_postal= stringQuote(code);
		}

		public String getVille(){
		
			return this.ville;
		}
	
			
		public void setVille(String ville){
		
			this.ville= stringQuote(ville);
		}
		
		
		public String getPays(){
		
			return this.pays;
		}
	
			
		public void setPays(String pays){
		
			this.pays = stringQuote(pays);
		}

	}
