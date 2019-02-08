package fr.akharroub.patternmvc.produit.business.impl;

import java.util.ArrayList;


import fr.akharroub.patternmvc.produit.bean.Produit;
import fr.akharroub.patternmvc.produit.business.IProduitBusiness;


public class ProduitBusiness implements IProduitBusiness {
	public ArrayList<Produit> getProduit(){
		
		Produit axe = new Produit("axe", 3.20, "https://www.axe.com/de/home.html", "ressource/images/produit/axe.png");
		Produit lait = new Produit("lait", 1.20, "http://lactel.fr/", "ressource/images/produit/lait.png");
		Produit the = new Produit("the", 2.00, "https://www.lipton.com/fr/home.html", "ressource/images/produit/thé.jpg");
		Produit cafe = new Produit("cafe", 3.20, "https://www.nespresso.com/fr/fr/", "ressource/images/produit/cafe.jpg");
		Produit lindt = new Produit("lindt", 2.99, "https://www.lindt.fr/", "ressource/images/produit/lindt.jpg");
		Produit cristaline = new Produit("cristaline", 0.99, "https://www.moneaucristaline.fr/", "ressource/images/produit/cristaline.jpg");
		Produit jus = new Produit("jus", 3.99, "https://www.joker.fr/", "ressource/images/produit/jus.jpg");
		Produit cocacola = new Produit("coca cola", 1.99, "https://www.coca-cola-france.fr", "ressource/images/produit/coca-cola.jpg");
		
		ArrayList<Produit> Produit = new ArrayList<Produit>();
		Produit.add(axe);
		Produit.add(lait);
		Produit.add(the);
		Produit.add(cafe);
		Produit.add(lindt);
		Produit.add(cristaline);
		Produit.add(jus);
		Produit.add(cocacola);
		
		return Produit ;
	}
}
