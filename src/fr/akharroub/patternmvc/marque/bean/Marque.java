package fr.akharroub.patternmvc.marque.bean;

public class Marque {
	
	private String nom;
	private String lien;
	private String images;
	private int anneDeCreation ;
	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marque(String nom, String lien, String images, int anneDeCreation) {
		super();
		this.nom = nom;
		this.lien = lien;
		this.images = images;
		this.anneDeCreation = anneDeCreation;
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
	/**
	 * @return the anneDeCreation
	 */
	public int getAnneDeCreation() {
		return anneDeCreation;
	}
	/**
	 * @param anneDeCreation the anneDeCreation to set
	 */
	public void setAnneDeCreation(int anneDeCreation) {
		this.anneDeCreation = anneDeCreation;
	}
	
	

}
