package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.UtilConnection;
import Entity.Annonces;


public class AnnonceService {
		public Annonces getOne(int id) {
		try {
			Connection con = UtilConnection.seConnecter();
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM annonces Where id=?;");
			stmt.setInt(1, id);
		    
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				int user_id = rs.getInt(" user_id");
				String name = rs.getString("name");
				String description = rs.getString("description");
				int prix = rs.getInt("prix");
				String  url_photo =rs.getString("url_photo");
				String Categorie = rs.getString("Categorie");
				String SousCategorie = rs.getString("SousCategorie");
				return new Annonces(user_id, name, description, prix,url_photo,Categorie , SousCategorie);
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Annonces> getAll(){

		List<Annonces> ret = new ArrayList<Annonces>();

		try {
			Connection con = UtilConnection.seConnecter();
			String query = "SELECT * FROM Annonces;";
			ResultSet rs = con.createStatement().executeQuery(query);

			while (rs.next()) {
				int user_id = rs.getInt("user_id");
				String name = rs.getString("nom");
				String description = rs.getString("description");
				int prix = rs.getInt("prix");
				String  url_photo =rs.getString("url_photo");
				String Categorie = rs.getString("Categorie");
				String SousCategorie = rs.getString("SousCategorie");
				ret.add( new Annonces(user_id, name, description, prix,url_photo,Categorie , SousCategorie));
				
			}
				


			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}

	public void create(Annonces a) {
		try {
			Connection con = UtilConnection.seConnecter();
			System.out.println(con);
			PreparedStatement stmt = con.prepareStatement("INSERT INTO annonces (user_id,nom,description,prix,url_photo,categorie,souscategorie) VALUES (?,?,?,?,?,?,?);");
			stmt.setInt(1, a.getUser_id());
			stmt.setString(2, a.getNom());
			stmt.setString(3, a.getDescription()); 
			stmt.setInt(4, a.getPrix());
			stmt.setString(5, a.getURLphoto());
			stmt.setString(6, a.getCategorie()); 
			stmt.setString(7, a.getSousCategorie()); 
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void update(Annonces a) {
		try {
			Connection con = UtilConnection.seConnecter();
			PreparedStatement stmt = con.prepareStatement("UPDATE annonces  SET user_id=?, nom=?, description=?, prix=?,url_photo=?,Categorie=? , SousCategorie=? Where annonce_id=?");
			stmt.setInt(1, a.getUser_id());
			stmt.setString(2, a.getNom());
			stmt.setString(3, a.getDescription()); 
			stmt.setInt(4, a.getPrix());
			stmt.setString(5, a.getURLphoto());
			stmt.setString(6, a.getCategorie()); 
			stmt.setString(6, a.getSousCategorie()); 
			stmt.executeUpdate(); 
			con.close();
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		try {
			Connection con = UtilConnection.seConnecter();
			
			PreparedStatement stmt = con.prepareStatement("\"DELETE FROM annonces  Where id=?;");
			stmt.setInt(1, id);
		     stmt.executeQuery();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

	
		
	}

	
