<?php


import("framework.db.DataObject");


/**
 * Description of Commande
 *
 * @author ledoux-levin simon / ringenbach romain
 */
 
	class Commande implements DataObject{

	 	private idTitre;
	 	private loginClient ;
	 	private date;
		
		public function __construct(){
		
		}
		
		public function init($idT, $log, $date){
			
				$this->idTitre = $idT;
				$this->loginClient = $log;
				$this->date = $date;
		}
		
		public function getIdTitre(){
		
			return $this->idTitre;
		}
	
			
		public function setIdTitre($idT){
		
			$this->idTitre = $idT;
		}
		
		public function getLoginClient(){
		
			return $this->loginClient;
		}
	
			
		public function setLoginClient($log){
		
			$this->loginClient = $log;
		}
		
		public function getDate(){
		
			return $this->date;
		}
	
			
		public function setDate($date){
		
			$this->date = $date;
		}


	}
?>
