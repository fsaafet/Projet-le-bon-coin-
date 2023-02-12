package Entity;

public class Annonces {
	private int annonce_id;
	private int user_id;
	private String nom;
	private String description;
	private int prix;
	private String Categorie;
	private String sousCategorie;
	private String URLphoto;
	public Annonces(int annonce_id, int user_id, String name, String description, int prix, String uRLphoto,String Categorie, String sousCategorie) {
		super();
		this.annonce_id = annonce_id;
		this.user_id =user_id;
		this.nom = name;
		this.description = description;
		this.prix = prix;
		this.URLphoto = uRLphoto;
		this.Categorie = Categorie;
		this.sousCategorie = sousCategorie;
	}
	public Annonces( int user_id, String name, String description, int prix, String uRLphoto,String Categorie, String sousCategorie) {
		super();
		
		this.user_id =user_id;
		this.nom = name;
		this.description = description;
		this.prix = prix;
		this.URLphoto = uRLphoto;
		this.Categorie = Categorie;
		this.sousCategorie = sousCategorie;
	}
	
	public String getCategorie() {
		return Categorie;
	}

	public void setCategorie(String categorie) {
		Categorie = categorie;
	}

	public String getSousCategorie() {
		return sousCategorie;
	}

	public void setSousCategorie(String sousCategorie) {
		this.sousCategorie = sousCategorie;
	}

	public int getAnnonce_id() {
		return annonce_id;
	}
	public void setAnnonce_id(int annonce_id) {
		this.annonce_id = annonce_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int id) {
		this.user_id =id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String name) {
		this.nom = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getURLphoto() {
		return URLphoto;
	}
	public void setURLphoto(String uRLphoto) {
		URLphoto = uRLphoto;
	}

}
