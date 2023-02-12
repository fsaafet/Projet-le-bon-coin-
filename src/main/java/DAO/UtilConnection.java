 package DAO;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class UtilConnection {
		public static Connection seConnecter() {

			String DRIVER = "org.postgresql.Driver";
			String URL= "jdbc:postgresql://localhost:5432/leboncoin";
			String LOGIN= "postgres";
			String PASSWORD= "11805864";

			Connection connection = null;

			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			} catch (SQLException e) {
				System.out.println("SQLException");
			} catch (ClassNotFoundException e1) {
				System.out.println("ClassNotFoundException");
			}


			return connection;
		}	
	}



