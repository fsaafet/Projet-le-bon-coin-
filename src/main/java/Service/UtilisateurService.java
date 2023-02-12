package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.UtilConnection;
import Entity.Utilisateurs;
public class UtilisateurService {
	public Utilisateurs getOne(int id) {
	try {
		Connection con = UtilConnection.seConnecter();
		PreparedStatement stmt = con.prepareStatement("SELECT FROM utilisateurs  Where id=?;");
		stmt.setInt(1, id);
	    
		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {
			String username = rs.getString("username");
			String email = rs.getString("email");
			String password = rs.getString("password");
			int age = rs.getInt("age");
			String  URLphoto =rs.getString("url_photo");

			return new Utilisateurs( username, email, password, age,URLphoto);
		}

		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}

public List<Utilisateurs> getAll(){

	List<Utilisateurs> ret = new ArrayList<Utilisateurs>();

	try {
		Connection con = UtilConnection.seConnecter();
		String query = "SELECT * FROM Utilisateurs;";
		ResultSet rs = con.createStatement().executeQuery(query);

		while (rs.next()) {
			int id = rs.getInt("id");
			String username = rs.getString("username");
			String email = rs.getString("email");
			String password = rs.getString("password");
			int age = rs.getInt("age");
			String  URLphoto =rs.getString("url_photo");

			ret.add( new Utilisateurs( id,username, email, password, age,URLphoto));
		}
			


		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return ret;
}

public void create(Utilisateurs u) {
	try {
		Connection con = UtilConnection.seConnecter();
		
		PreparedStatement stmt = con.prepareStatement("INSERT INTO utilisateurs (username,password, email,age ,url_photo) VALUES (?,?,?, ?,?);");
		stmt.setString(1, u.getUsername());
		stmt.setString(3, u.getEmail());
		stmt.setString(2, u.getPassword()); 
		stmt.setInt(4, u.getAge());
		stmt.setString(5, u.getURLphoto());
		stmt.executeUpdate(); 
		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

public void update(Utilisateurs u) {
	try {
		Connection con = UtilConnection.seConnecter();
		PreparedStatement stmt = con.prepareStatement("UPDATE Utilisateurs SET username=?,passeword=?,email=?,age=?,Urlphoto=? Where id=?");
		stmt.setString(1, u.getUsername());
		stmt.setString(2, u.getPassword()); 
		stmt.setString(3, u.getEmail());
		stmt.setInt(4, u.getAge());
		stmt.setString(5, u.getURLphoto());
		stmt.executeUpdate(); 
		con.close();
		} catch (SQLException e) {
		e.printStackTrace();
	}
}

public void delete(int id) {
	try {
		Connection con = UtilConnection.seConnecter();
		
		PreparedStatement stmt = con.prepareStatement("\"DELETE FROM characters  Where id=?;");
		stmt.setInt(1, id);
	     stmt.executeQuery();

		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

public static Utilisateurs getbyEmail(String email) {
	try {
		Connection con = UtilConnection.seConnecter();
		PreparedStatement stmt = con.prepareStatement("SELECT FROM utilisateurs  Where email=? ;");
		stmt.setString(1, email);
	    
		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {
			String username = rs.getString("username");
			String Email = rs.getString("email");
			String password = rs.getString("password");
			int age = rs.getInt("age");
			String  URLphoto =rs.getString("url_photo");

			return new Utilisateurs( username, Email, password, age,URLphoto);
		}

		con.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
}

}




