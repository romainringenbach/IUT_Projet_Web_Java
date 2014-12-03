<?php


import("framework.db.DataObject");


/**
 * Description of Categorie
 *
 * @author ledoux-levin simon / ringenbach romain
 */
	class Categorie implements DataObject{

	 	private $nom;
		
		public function __construct(){
		
		}
		
		public function init($name){
			
				$this->nom = $name;
				
		}
		
		public function getNom(){
		
			return $this->nom;
		}
	
			
		public function setNom($name){
		
			$this->nom = $name;
		}

	}
?>
			
		
		
		