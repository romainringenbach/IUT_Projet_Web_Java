<?php


import("framework.db.DataObject");


/**
 * Description of Titre
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	class Titre implements DataObject{

	 	private $id;
	 	private $nom;
	 	private $album;
	 	private $artiste;
	 	private $categorie;
	 	private $prix;
	 	
		
		public function __construct(){
		
		}
		
		public function init($idi, $name, $album, $artiste, $categorie, $prix){
			
				$this->id = $idi;
				$this->nom = $name;
				$this->album =$album;
				$this->artiste =$artiste;
				$this->categorie =$categorie;
				$this->prix =$prix;
		}
		
		public function getNom(){
		
			return $this->nom;
		}
	
			
		public function setNom($name){
		
			$this->nom = $name;
		}
		
		public function getId(){
		
			return $this->id;
		}
	
			
		public function setId($idi){
		
			$this->id = $idi;
		}
		
		public function getAlbum(){
		
			return $this->album;
		}
	
			
		public function setAlbum($album){
		
			$this->album = $album;
		}
		
		public function getArtiste(){
		
			return $this->artiste;
		}
	
			
		public function setArtiste($artiste){
		
			$this->artiste = $artiste;
		}
		
		public function getCategorie(){
		
			return $this->categorie;
		}
	
			
		public function setCategorie($categorie){
		
			$this->categorie= $categorie;
		}
		
		public function getPrix(){
		
			return $this->prix;
		}
	
			
		public function setPrix($prix){
		
			$this->prix = $prix;
		}


	}
?>
