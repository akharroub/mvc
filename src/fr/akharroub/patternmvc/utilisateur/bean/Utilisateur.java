package fr.akharroub.patternmvc.utilisateur.bean;

public class Utilisateur {
	private String nom;
	private String prenom;
	private String lienimages;
	private int age;
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String nom, String prenom, String lienimages, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.lienimages = lienimages;
		this.age = age;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the lienimages
	 */
	public String getLienimages() {
		return lienimages;
	}
	/**
	 * @param lienimages the lienimages to set
	 */
	public void setLienimages(String lienimages) {
		this.lienimages = lienimages;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}
