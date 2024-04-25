package xxIPv6Simulator;

import java.util.Random;

public class PhotoDogCats {
	Random RandomSelectedAnimal = new Random();
	
	private String dogFolderPath = "/xxIPv6Simulator/dog_images";
	private String catFolderPath = "/xxIPv6Simulator/cat_images";
	private String[] dogs = {"beagle", "k9", "retriever",  "spitz"};
	private String[] cats = {"persian", "philippine", "rogdoll", "scottish", "siberian"};
	
	int rndmDog = RandomSelectedAnimal.nextInt(dogs.length);
	int rndmCat = RandomSelectedAnimal.nextInt(cats.length);
	
	private String dogSelected = dogs[rndmDog];
	private String catSelected = cats[rndmCat];
	
	public String getDogFolderPath() {
		return dogFolderPath;
	}
	
	public String getCatFolderPath() {
		return catFolderPath;
	}
	
	public String getDogSelected() {
		return dogSelected;
	}
	
	public String getCatSelected() {
		return catSelected;
	}

}
