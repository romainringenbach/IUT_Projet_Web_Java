<?php 

import ('framework.Application');
import ('musiconline.db.Pays');
import ('framework.db.DataAccessObject');
import ('framework.db.DataObject');

/**
 * Description of ArtisteDAO  
 *
 * @author lesommer
 */
class ArtisteDAO implements DataAccessObject{



    private static $dao;
    
    
    
    private function __construct() {
    }
    
    
    
    public final static function getInstance() {
        if(!isset(self::$dao)) {
            self::$dao= new ArtisteDAO();
        }
        return self::$dao;
    }
    
    
  	public final function findAll(){
  	
		$dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
		$query = "select * from Artiste order by nom";
		$stmt = $dbc->query($query);
		$results = $stmt->fetchALL(PDO::FETCH_CLASS, 'Artiste');
    		
    		return $results;
    }
    
    
    
   public final function insert(DataObject $artiste){
        if($artiste instanceof Artiste){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "insert into Artiste(nom) values (:n)";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	        $stmt->bindValue(':n',$artiste->getNom(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        $stmt->execute();
        }
    }
    
     public function delete(DataObject $artiste){
     	
     	if($artiste instanceof Artiste){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "DELETE FROM Artiste WHERE id_artiste=:n";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	        $stmt->bindValue(':n',$artiste->getId(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        $stmt->execute();
      	}
     
      }    
    
	public function update(DataObject $artiste){
	
	    if($artiste instanceof Artiste){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "UPDATE Artiste SET nom=:n WHERE id_artiste=:i";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	        $stmt->bindValue(':n',$artiste->getNom(),PDO::PARAM_STR);
	        $stmt->bindValue(':i',$artiste->getId(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        $stmt->execute();
      	}
	 }
}
?> 
