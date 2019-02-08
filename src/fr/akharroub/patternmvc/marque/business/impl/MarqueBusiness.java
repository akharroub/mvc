package fr.akharroub.patternmvc.marque.business.impl;

import java.util.ArrayList;

import fr.akharroub.patternmvc.marque.bean.Marque;
import fr.akharroub.patternmvc.marque.business.IMarqueBusiness;

public class MarqueBusiness implements IMarqueBusiness {

	@Override
	public ArrayList<Marque> getMarque() {
		
		Marque apple = new Marque("Apple", "https://www.apple.com/", "ressource/images/marque/apple.jpg", 1976);
		Marque compaq = new Marque("Compaq", "https://fr.wikipedia.org/wiki/Compaq", "ressource/images/marque/compaq.png", 1982);
		Marque dell = new Marque("DELL", "https://www.dell.com/fr-fr", "ressource/images/marque/dell.png", 1984);
		Marque hp = new Marque("HP", "https://www8.hp.com/fr/fr/home.html", "ressource/images/marque/hp.png", 1939);
		Marque ibm = new Marque("IBM", "https://www.ibm.com/fr-fr/?ar=1", "ressource/images/marque/ibm.png", 1911);
		Marque lenovo = new Marque("Lenovo", "https://www.lenovo.com/fr/fr/soldes/?gclid=CjwKCAiAqOriBRAfEiwAEb9oXc_v0oMjw_mRGLTQAxW0VdP9qL318FwH9l6VizaOGLcYxa9EUht50xoC7wIQAvD_BwE&cid=fr:sem|se|google|&ef_id=CjwKCAiAqOriBRAfEiwAEb9oXc_v0oMjw_mRGLTQAxW0VdP9qL318FwH9l6VizaOGLcYxa9EUht50xoC7wIQAvD_BwE:G:s&s_kwcid=AL!4312!3!287452335111!e!!g!!lenovo&cid=fr:sem|se|google|G-FR-EMEA-Lenovo-PS-B-Brand", "ressource/images/marque/lenovo.png", 1984);
		Marque samsung = new Marque("Samsung", "https://www.samsung.com/fr/", "ressource/images/marque/samsung.png", 1938);
		Marque windows = new Marque("Windows", "https://www.microsoft.com/fr-fr/windows", "ressource/images/marque/windows.png", 1985);
		
		
		ArrayList<Marque> marque = new ArrayList<Marque>();
		
		marque.add(apple);
		marque.add(compaq);
		marque.add(dell);
		marque.add(hp);
		marque.add(ibm);
		marque.add(lenovo);
		marque.add(samsung);
		marque.add(windows);
		
		return marque;
	}

}
