<?php


import("framework.db.DataObject");


/**
 * Description of Album
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	class Album implements DataObject{

	 	private $nom;
	 	private $id;
		
		public function __construct(){
		
		}
		
		public function init($idi, $name){
			
				$this->nom = $name;
				$this->id = $idi;
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


	}
?>