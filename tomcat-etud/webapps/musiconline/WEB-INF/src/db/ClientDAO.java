<?php 

import ('framework.Application');
import ('musiconline.db.Pays');
import ('framework.db.DataAccessObject');
import ('framework.db.DataObject');

/**
 * Description of ClientDAO  
 *
 * @author lesommer
 */
class ClientDAO implements DataAccessObject{



    private static $dao;
    
    
    
    private function __construct() {
    }
    
    
    
    public final static function getInstance() {
        if(!isset(self::$dao)) {
            self::$dao= new ClientDAO();
        }
        return self::$dao;
    }
    
    
  	public final function findAll(){
  	
		$dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
		$query = "select * from Client order by nom";
		$stmt = $dbc->query($query);
		$results = $stmt->fetchALL(PDO::FETCH_CLASS, 'Client');
    		
    		return $results;
   	 }
    
    
    
   public final function insert(DataObject $client){
        if($client instanceof Client){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");	

	        // prepare the SQL statement
	        $query = "insert into Client(login, email, passwd, nom, prenom, date_naissance, adresse, code_postal, ville, pays) values (:l, :e, :pass, :n, :p, :d, :a, :c, :v, :pa)";
	        $stmt = $dbc->prepare($query);

		
	        // bind the paramaters
	        $stmt->bindValue(':l',$client->getLogin(),PDO::PARAM_STR);
	        $stmt->bindValue(':e',$client->getEmail(),PDO::PARAM_STR);
	        $stmt->bindValue(':pass',$client->getPassword(),PDO::PARAM_STR);
	        $stmt->bindValue(':n',$client->getNom(),PDO::PARAM_STR);
	        $stmt->bindValue(':p',$client->getPrenom(),PDO::PARAM_STR);

	        $stmt->bindValue(':d',$client->getDateNaissance(),PDO::PARAM_STR);
	        $stmt->bindValue(':a',$client->getAdresse(),PDO::PARAM_STR);
	        $stmt->bindValue(':c',$client->getCodePostal(),PDO::PARAM_STR);
	        $stmt->bindValue(':v',$client->getVille(),PDO::PARAM_STR);
	        $stmt->bindValue(':pa',$client->getPays(),PDO::PARAM_STR);

	
	         // execute the prepared statement
        	$stmt->execute();

        }
    }
    
    
     public function delete(DataObject $client){
     	
     	if($client instanceof Client){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "DELETE FROM Client WHERE loginClient=:n";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	        $stmt->bindValue(':n',$client->getLogin(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        $stmt->execute();
      	}
     
      } 
      
	public function update(DataObject $client){
	
	    if($client instanceof Client){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "UPDATE Client SET nom=:n,prenom=:p,email=:e,passwd=:pass,date_naissance=:d,adresse=:a,code_postal=:c,ville=:v,pays=:pa WHERE loginClient=:l";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	        $stmt->bindValue(':l',$client->getLogin(),PDO::PARAM_STR);
	        $stmt->bindValue(':e',$client->getEmail(),PDO::PARAM_STR);
	        $stmt->bindValue(':pass',$client->getPassword(),PDO::PARAM_STR);
	        $stmt->bindValue(':n',$client->getNom(),PDO::PARAM_STR);
	        $stmt->bindValue(':p',$client->getPrenom(),PDO::PARAM_STR);

	        $stmt->bindValue(':d',$client->getDateNaissance(),PDO::PARAM_STR);
	        $stmt->bindValue(':a',$client->getAdresse(),PDO::PARAM_STR);
	        $stmt->bindValue(':c',$client->getCodePostal(),PDO::PARAM_STR);
	        $stmt->bindValue(':v',$client->getVille(),PDO::PARAM_STR);
	        $stmt->bindValue(':pa',$client->getPays(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        $stmt->execute();
	    }
      	}      
}

?>
