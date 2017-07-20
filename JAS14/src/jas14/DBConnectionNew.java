package jas14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionNew {

	private Connection con;
	private Statement stmt;
	String root="root";
	String pass="kwiat23";
	
	
	private DBConnectionNew(String login, String haslo) throws ClassNotFoundException, SQLException{//nie mozna stworzyc obiektu jak priv 
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skoczkowie",login,haslo);
		stmt=con.createStatement();
		
		
		
	}
	public static DBConnectionNew makeConnection(String login, String haslo) throws MySuperExc {
		try {
			DBConnectionNew newCon =new DBConnectionNew(login,haslo);
			return newCon;
		} catch (Exception e) {
			throw new MySuperExc();
		}
	}
	
	
	ResultSet getTable(String nazwaTabeli) throws SQLException{
		String query= "select * from "+ nazwaTabeli;
		ResultSet rs= stmt.executeQuery(query);
		return rs;
		
	}	
	
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public Statement getStmt() {
		return stmt;
	}
	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}
	
	
}
