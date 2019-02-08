package fr.akharroub.patternmvc.animal.business.impl;

import java.util.ArrayList;

import fr.akharroub.patternmvc.animal.bean.Animal;
import fr.akharroub.patternmvc.animal.business.IAnimalBusiness;

public class AnimalBusiness implements IAnimalBusiness  {





	@Override
	public ArrayList<Animal> getAnimal() {
		Animal ane = new Animal("ane", "ressource/images/animal/ane.jpg", 15);
		Animal chat = new Animal("chat", "ressource/images/animal/chat.jpg", 2);
		Animal chien = new Animal("chien", "ressource/images/animal/chien.jpg", 7);
		Animal lion = new Animal("lion", "ressource/images/animal/lion.jpg", 10);
		Animal ours = new Animal("ours", "ressource/images/animal/ours.jpg", 8);
		Animal panda = new Animal("panda", "ressource/images/animal/panda.jpg", 2);
		Animal singe = new Animal("singe", "ressource/images/animal/singe.jpg", 9);
		Animal tigre = new Animal("tigre", "ressource/images/animal/tigre.jpg", 6);
		
		ArrayList<Animal> Animal = new ArrayList<Animal>();
		Animal.add(ane);
		Animal.add(chat);
		Animal.add(chien);
		Animal.add(lion);
		Animal.add(ours);
		Animal.add(panda);
		Animal.add(singe);
		Animal.add(tigre);
		
		
		
		
		return Animal;
	}

}
