<?php 

import ('framework.Application');
import ('musiconline.db.Pays');
import ('framework.db.DataAccessObject');
import ('framework.db.DataObject');
/**
 * Description of TitreDAO  
 *
 * @author lesommer
 */
class TitreDAO implements DataAccessObject{



    private static $dao;
    
    
    
    private function __construct() {
    }
    
    
    
    public final static function getInstance() {
        if(!isset(self::$dao)) {
            self::$dao= new TitreDAO();
        }
        return self::$dao;
    }
    
    
  	public final function findAll(){
  	
		$dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
		$query = "select * from Titre order by nom";
		$stmt = $dbc->query($query);
		$results = $stmt->fetchALL(PDO::FETCH_CLASS, 'Titre');
    		
    		return $results;
    }
    
    
    
   public final function insert(DataObject $titre){
        if($titre instanceof Titre){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "insert into Titre(nom, album, artiste, categorie, prix) values (:n, :al, :ar, :c; :p)";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	        $stmt->bindValue(':n',$titre->getNom(),PDO::PARAM_STR);
		$stmt->bindValue(':al',$titre->getAlbum(),PDO::PARAM_STR);
		$stmt->bindValue(':ar',$titre->getArtiste(),PDO::PARAM_STR);
		$stmt->bindValue(':c',$titre->getCategorie(),PDO::PARAM_STR);
		$stmt->bindValue(':p',$titre->getPrix(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        $stmt->execute();
        }
    }
    
    
     public function delete(DataObject $titre){
     	
     	if($titre instanceof Titre){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "DELETE FROM Titre WHERE id_titre=:n";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	        $stmt->bindValue(':n',$titre->getId(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        $stmt->execute();
      	}
     
      } 
     
     
	public function update(DataObject $titre){ 
	
	    if($titre instanceof Album){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "UPDATE Titre SET nom=:n, album=:al, artiste=:ar, categorie=:c, prix=:p WHERE id_titre=:i";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	  	$stmt->bindValue(':n',$titre->getNom(),PDO::PARAM_STR);
		$stmt->bindValue(':al',$titre->getAlbum(),PDO::PARAM_STR);
		$stmt->bindValue(':ar',$titre->getArtiste(),PDO::PARAM_STR);
		$stmt->bindValue(':c',$titre->getCategorie(),PDO::PARAM_STR);
		$stmt->bindValue(':p',$titre->getPrix(),PDO::PARAM_STR);
		$stmt->bindValue(':i',$titre->getId(),PDO::PARAM_STR);
		
	
	
	         // execute the prepared statement
	        $stmt->execute();
      	}
      }
	
	
}
?> 
