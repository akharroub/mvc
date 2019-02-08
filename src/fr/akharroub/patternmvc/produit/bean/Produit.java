package fr.akharroub.patternmvc.produit.bean;

public class Produit {
	private String nom;
	private Double prix;
	private String lien;
	private String images;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String nom, Double prix, String lien, String images) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.lien = lien;
		this.images = images;
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
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	/**
	 * @return the lien
	 */
	public String getLien() {
		return lien;
	}
	/**
	 * @param lien the lien to set
	 */
	public void setLien(String lien) {
		this.lien = lien;
	}
	/**
	 * @return the images
	 */
	public String getImages() {
		return images;
	}
	/**
	 * @param images the images to set
	 */
	public void setImages(String images) {
		this.images = images;
	}
	
}
