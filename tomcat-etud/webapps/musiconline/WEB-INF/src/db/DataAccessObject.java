package db;

import java.sql.*;
import org.sqlite.*;
import org.sqlite.JDBC;

public abstract class DataAccessObject {

	private static DataAccessObject dao;

	protected DataAccessObject(){;}

    public static DataAccessObject getInstance(){  return null;}

    protected final SQliteConnexion connexion(){

    	SQliteConnexion dbc = SQliteConnexion.getInstance();
    	return dbc;

    }

    protected final PreparedStatement pStatement(SQliteConnexion connexion, String statement) throws SQLException{

    	PreparedStatement st = connexion.getConnection().prepareStatement(statement);
    	return st;

    }

    protected final void statement(SQliteConnexion connexion, String statement) throws SQLException{

    	PreparedStatement st = connexion.getConnection().prepareStatement(statement);
    	st.execute();

    }    
 
    protected final void statement(Connection connexion, String statement) throws SQLException{

    	PreparedStatement st = connexion.prepareStatement(statement);
    	st.execute();

    }   

    // INSERTION , DELETE, UPDATE

    public final void insert(DataObject data) throws Exception {

    	Connection dbc = this.connexion().getConnection();
    	dbc.setAutoCommit(false);
    	this.insertPr(data, dbc);
    	try{
    		dbc.commit();
    	}
    	catch(Exception e){
    		dbc.rollback();
    		throw new Exception("Erreur : impossible de faire le commit, application du rollback");
    	}

    }

    public final void delete(DataObject data) throws Exception {

    	Connection dbc = this.connexion().getConnection();
    	dbc.setAutoCommit(false);
    	this.deletePr(data, dbc);
    	try{
    		dbc.commit();
    	}
    	catch(Exception e){
    		dbc.rollback();
    		throw new Exception("Erreur : impossible de faire le commit, application du rollback");
    	}

    }

    public final void update(DataObject data) throws Exception {

    	Connection dbc = this.connexion().getConnection();
    	dbc.setAutoCommit(false);
    	this.updatePr(data, dbc);
    	try{
    		dbc.commit();
    	}
    	catch(Exception e){
    		dbc.rollback();
    		throw new Exception("Erreur : impossible de faire le commit, application du rollback");
    	}

    }
    
  	public final ResultSet findAll(String table) throws SQLException{
  	
    		Connection dbc = this.connexion().getConnection();	
		String query = "select * from "+table;
		Statement stmt = dbc.createStatement();
		ResultSet rs = stmt.executeQuery(query);
    		
    	return rs;
    }
    
    
    public abstract void insertPr(DataObject data, java.sql.Connection dbc) throws SQLException;


    public abstract void deletePr(DataObject data, java.sql.Connection dbc) throws SQLException;


    public abstract void updatePr(DataObject data, java.sql.Connection dbc) throws SQLException;



} 
