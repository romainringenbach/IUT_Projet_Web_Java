<?php


import("framework.db.DataObject");


/**
 * Description of Client
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	class Client implements DataObject{

	 	private $login;
	 	private $email;
	 	private $passwd;
	 	private $nom;
	 	private $prenom;
	 	private $dateNaissance;
	 	private $adresse ;
	  	private $code_postal;
	 	private $ville;
	 	private $pays ;
	 	
		
		public function __construct(){
		
		}
		
		public function init($login, $email, $passwd, $nom, $prenom, $dateNaissance, $adresse, $code_postal, $ville, $pays){
			
				$this->login = $login;
				$this->email = $email;
				$this->passwd =$passwd;
				$this->nom =$nom;
				$this->prenom =$prenom;
				$this->date_naissance =$dateNaissance;
				$this->adresse =$adresse;
				$this->code_postal =$code_postal;
				$this->ville =$ville;
				$this->pays =$pays;
		}
		
		public function getLogin(){
		
			return $this->login;
		}
	
			
		public function setLogin($login){
		
			$this->login = $login;
		}
		
		public function getEmail(){
		
			return $this->email;
		}
	
			
		public function setEmail($email){
		
			$this->email = $email;
		}
		
		public function getPassword(){
		
			return $this->passwd;
		}
	
			
		public function setPassword($password){
		
			$this->passwd = $password;
		}
		
		public function getNom(){
		
			return $this->nom;
		}
	
			
		public function setNom($name){
		
			$this->nom = $name;
		}
		
		public function getPrenom(){
		
			return $this->prenom;
		}
	
			
		public function setPrenom($prenom){
		
			$this->prenom= $prenom;
		}
		
		public function getDateNaissance(){
		
			return $this->date_naissance;
		}
	
			
		public function setDateNaissance($date){
		
			$this->date_naissance = $date;
		}
		
		public function getAdresse(){
	
			return $this->adresse;
		}
	
			
		public function setAdresse($adresse){
		
			$this->adresse= $adresse;
		}
		
		public function getCodePostal(){
		
			return $this->code_postal;
		}
	
			
		public function setCodePostal($code){
		
			$this->code_postal= $code;
		}

		public function getVille(){
		
			return $this->ville;
		}
	
			
		public function setVille($ville){
		
			$this->ville= $ville;
		}
		
		
		public function getPays(){
		
			return $this->pays;
		}
	
			
		public function setPays($pays){
		
			$this->pays = pays;
		}

	}
?>