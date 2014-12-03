package db;

import java.sql.*;
import javax.sql.*;
import db.*;

public abstract class DataAccesObject {

	private static DataAccesObject dao;

	protected DataAccesObject(){};

    public abstract DataAccesObject getInstance();

    protected final SQLiteConnexion connexion(){

    	SQLiteConnexion dbc = SQLiteConnexion.getDBConnection();
    	return dbc;

    }

    protected final PreparedStatement pStatement(SQLiteConnexion connexion, String statement){

    	PreparedStatement st = connexion.preparedStatement(statement);
    	return st;

    }

    protected final void statement(SQLiteConnexion connexion, String statement){

    	PreparedStatement st = connexion.preparedStatement(statement);
    	st.execute();

    }    

    // INSERTION , DELETE, UPDATE

    public final void insert(DataObject data) throws Exception {

    	SQLiteConnexion dbc = this.connexion();
    	connexion.setAutoCommit(false);
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

    	SQLiteConnexion dbc = this.connexion();
    	connexion.setAutoCommit(false);
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

    	SQLiteConnexion dbc = this.connexion();
    	connexion.setAutoCommit(false);
    	this.updatePr(data, dbc);
    	try{
    		dbc.commit();
    	}
    	catch(Exception e){
    		dbc.rollback();
    		throw new Exception("Erreur : impossible de faire le commit, application du rollback");
    	}

    }
    
  	public final ResultSet findAll(String table){
  	
    	SQLiteConnexion dbc = this.connexion();		
		String query = "select * from "+table;
		stmt = dbc.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE);
		ResultSet rs = stmt.executeQuery(query);
    		
    	return rs;
    }
    
    
    private abstract void insertPr();

    private abstract void deletePr();

    private abstract void updatePr();



} 