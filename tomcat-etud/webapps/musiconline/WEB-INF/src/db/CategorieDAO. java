<?php 

import ('framework.Application');
import ('musiconline.db.Pays');
import ('framework.db.DataAccessObject');
import ('framework.db.DataObject');

/**
 * Description of CategorieDAO  
 *
 * @author lesommer
 */
class CategorieDAO implements DataAccessObject{



    private static $dao;
    
    
    
    private function __construct() {
    }
    
    
    
    public final static function getInstance() {
        if(!isset(self::$dao)) {
            self::$dao= new CategorieDAO();
        }
        return self::$dao;
    }
    
    
  	public final function findAll(){
  	
		$dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
		$query = "select * from Categorie order by nom";
		$stmt = $dbc->query($query);
		$results = $stmt->fetchALL(PDO::FETCH_CLASS, 'Categorie');
    		
    		return $results;
    }
    
    
    
   public final function insert(DataObject $categorie){
        if($categorie instanceof Categorie){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "insert into Categorie(nom) values (:n)";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	        $stmt->bindValue(':n',$categorie->getNom(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        $stmt->execute();
        }
    }
    
    
     public function delete(DataObject $categorie){
     	
     	if($categorie instanceof Categorie){
	        $dbc = Application::getInstance()->getDBConnection();
		$dbc->exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        $query = "DELETE FROM Categorie WHERE nom=:n";
	        $stmt = $dbc->prepare($query);
	
	        // bind the paramaters
	        $stmt->bindValue(':n',$categorie->getNom(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        $stmt->execute();
      	}
     
      } 
     
     
	public function update(DataObject $obj){
	
		echo "ERROR : Update forbiden, Nom of the Categorie can't be change.";
		
	 }
	
	
}
?> 
