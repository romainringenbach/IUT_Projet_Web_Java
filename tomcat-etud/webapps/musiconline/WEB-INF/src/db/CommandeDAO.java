package db;

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
	
    private static CommandeDAO dao;
    
    
    private CommandeDAO() {    }
    
   
    public final static CommandeDAO getInstance() {
        if(this.dao == null) {
            this.dao= new CommandeDAO();
        }
        return this.dao;
    }
    
    

   private final void insertPr(Commande commande, SQliteConnexion dbc){

	        String query = "insert into Commande(id_titre, loginClient, date) values ("+commande.getIdTitre()+","+ commande.getLoginClient()+","+ commande.getDate()+")" ;
	        super.statement(dbc,query);

    }
    
    
    private void deletePr(Commande commande, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Commande WHERE loginClient="+commande.getLoginClient()+" AND id_titre="+commande.getIdTitre() ;
	        super.statement(dbc,query);

     
      }
     
	private void updatePr(Commande commande, SQliteConnexion dbc){
			
	        
	
	}

	
}
