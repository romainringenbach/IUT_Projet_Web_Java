<?php 

import ('framework.Application');
import ('musiconline.db.Pays');
import ('framework.db.DataAccessObject');
import ('framework.db.DataObject');

/**
 * Description of PaysDAO  
 *
 * @author lesommer
 */
class PaysDAO implements DataAccessObject{



    private static dao;
    
    
    
    private PaysDAO() {
    }
    
    
    
    public final static function getInstance() {
        if(!isset(self::dao)) {
            self::dao= new PaysDAO();
        }
        return self::dao;
    }
    
    
  	public final function findAll(){
  	
		dbc = Application::getInstance().getDBConnection();
		dbc.exec("SET NAMES UTF8");
		query = "select * from Pays order by nom";
		stmt = dbc.query(query);
		results = stmt.fetchALL(PDO::FETCH_CLASS, 'Pays');
    		
    		return results;
    }
    
    
    
   public final function insert(DataObject pays){
        if(pays instanceof Pays){
	        dbc = Application::getInstance().getDBConnection();
		dbc.exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        query = "insert into Pays(nom) values (:n)";
	        stmt = dbc.prepare(query);
	
	        // bind the paramaters
	        stmt.bindValue(':n',pays.getNom(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        stmt.execute();
        }
    }
    
    
     public function delete(DataObject pays){
     	
     	if(pays instanceof Pays){
	        dbc = Application::getInstance().getDBConnection();
		dbc.exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        query = "DELETE FROM Pays WHERE nom=:n";
	        stmt = dbc.prepare(query);
	
	        // bind the paramaters
	        stmt.bindValue(':n',pays.getNom(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        stmt.execute();
      	}
     
      }
     
     
	public function update(DataObject obj){ 		
	
		echo "ERROR : Update forbiden, Nom of the Pays can't be change.";
	
	}
	
	
}
?> 
