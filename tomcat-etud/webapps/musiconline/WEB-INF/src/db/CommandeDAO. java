<?php 

import ('framework.Application');
import ('musiconline.db.Pays');
import ('framework.db.DataAccessObject');
import ('framework.db.DataObject');

/**
 * Description of CommandeDAO  
 *
 * @author lesommer
 */
class CommandeDAO implements DataAccessObject{



    private static $dao;
    
    
    
    private function __construct() {
    }
    
    
    
    public final static function getInstance() {
        if(!isset(self::$dao)) {
            self::$dao= new CommandeDAO();
        }
        return self::$dao;
    }
    
    
  	public final function findAll(){
  	
		$dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
		$query = "select * from Commande";
		$stmt = $dbc->query($query);
		$results = $stmt->fetchALL(PDO::FETCH_CLASS, 'Commande');
    		
    		return $results;
    }
    
    
    
   public final function insert(DataObject $commande){
        if($commande instanceof Commande){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "insert into Commande(id_titre, loginClient, date) values (:i, :l, :d)";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	        $stmt->bindValue(':i',$commande->getIdTitre(),PDO::PARAM_STR);
		$stmt->bindValue(':l',$commande->getLoginClient(),PDO::PARAM_STR);
		$stmt->bindValue(':d',$commande->getDate(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        $stmt->execute();
        }
    }
    
    
     public function delete(DataObject $commande){
     	
     	if($commande instanceof Commande){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "DELETE FROM Commande WHERE loginClient=:m AND id_titre=:n";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	        $stmt->bindValue(':n',$commande->getIdTitre(),PDO::PARAM_STR);
	        $stmt->bindValue(':m',$commande->getLoginClient(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        $stmt->execute();
      	}
     
      }
     
     
	public function update(DataObject $obj){ 
	
		echo "ERROR : Update forbiden, the date can't be change.";
		//La date étant générée automatiquement, elle n'a pas d'intérêt à être modifié.
	
	}
	
	
}
?> 
