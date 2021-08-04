package service;

import java.sql.SQLException;

import been.UserInfo;
import dao.UserDAO;

public class LoginService {
	UserDAO ud;
	UserInfo ui;
	public UserInfo search(String id , String pass) throws ClassNotFoundException, SQLException {
		ud = new UserDAO();
		ui = ud.excuteLg(id, pass);
		return ui;
	}
}
