package fr.akharroub.patternmvc.animal.bean;

public class Animal {
	private String nom;
	private String images;
	private int age;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String nom, String images, int age) {
		super();
		this.nom = nom;
		this.images = images;
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
