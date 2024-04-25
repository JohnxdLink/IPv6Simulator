package xxIPv6Simulator;

public class SearchEngine {
	PhotoDogCats DogNCat = new PhotoDogCats();
	
	private String ipv6AddressFound;
	private String searchEngine;
	private String selectedImage;
	
	public String getSelectedImage() {
		String search = getSearchEngine();
		String ipv6Add = getIpv6AddressFound();
		
		if(!ipv6Add.isEmpty()) {
			if(search.equalsIgnoreCase("Dog")) {
				selectedImage = DogNCat.getDogFolderPath() + DogNCat.getDogSelected() + ".png";
				
			} else if(search.equalsIgnoreCase("Cat")) {
				selectedImage = DogNCat.getCatFolderPath() + DogNCat.getCatSelected() + ".png";
			} else {
				return null;
			}
		}
		
		return selectedImage;
	}
	
	public String getIpv6AddressFound() {
		return ipv6AddressFound;
	}
	
	public String getSearchEngine() {
		return searchEngine;
	}
	
	public void setIpv6AddressFound(String ipv6Add) {
		ipv6AddressFound = ipv6Add;
	}
	
	public void setSearchEngine(String searchEng) {
		searchEngine = searchEng;
	}

}
