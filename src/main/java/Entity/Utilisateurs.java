package Entity;

public class Utilisateurs {
	private int id;
	private String username;
	private String email;
	private String password;
	private int age;
	private String URLphoto;
	public Utilisateurs(int id, String username, String email, String password, int age, String uRLphoto) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.age = age;
		URLphoto = uRLphoto;
	}
	public Utilisateurs( String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Utilisateurs( String username, String email, String password, int age, String uRLphoto) {
		super();
	
		this.username = username;
		this.email = email;
		this.password = password;
		this.age = age;
		URLphoto = uRLphoto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getURLphoto() {
		return URLphoto;
	}
	public void setURLphoto(String uRLphoto) {
		URLphoto = uRLphoto;
	}
	
}
