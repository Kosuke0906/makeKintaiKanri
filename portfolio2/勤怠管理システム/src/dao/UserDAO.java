package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import been.UserInfo;
import common.ConnectionDB;
import common.ConstSQL;

public class UserDAO {
	public Connection co;
	public Statement st;
	public PreparedStatement preparedSt;
	public UserInfo ui;
	public ConnectionDB cd;
	public UserInfo excuteLg(String id , String pass) throws ClassNotFoundException, SQLException {
		cd = new ConnectionDB();
		cd.connect();
		co = cd.connect();
		st = cd.createSt();
		preparedSt = co.prepareStatement(ConstSQL.LOGIN);
		preparedSt.setString(1, id);
		preparedSt.setString(2, pass);
		ResultSet rs = st.executeQuery(preparedSt.toString());

		if(!rs.next()) {
			cd.desconDB();
			return ui = new UserInfo();
		}else {
			ui = new UserInfo(
					rs.getString("id"),
					rs.getString("pass"),
					rs.getString("name")
					);
			cd.desconDB();
			return ui;
		}
	}

}
