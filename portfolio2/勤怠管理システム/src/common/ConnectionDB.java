package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {
private static final String URL = "jdbc:postgresql://localhost:5432/勤怠管理?useUnicode=true&characterEncoding=utf8";
private static final String USER = "postgres";
private static final String PASS = "postgres";
private Connection co;
private Statement st;
public Connection connect() throws ClassNotFoundException, SQLException {
	Class.forName("org.postgresql.Driver");
	return DriverManager.getConnection(URL, USER, PASS);
}
public Connection dbConnect() throws ClassNotFoundException, SQLException {
	ConnectionDB cm = new ConnectionDB();
	return co = cm.connect();
}
public Statement createSt() throws SQLException, ClassNotFoundException {
	ConnectionDB cm = new ConnectionDB();
	 co = cm.connect();
	return st = co.createStatement();
}
public void desconDB() throws SQLException {
	if(co != null) co.close();
	if(st != null) st.close();
}
}
