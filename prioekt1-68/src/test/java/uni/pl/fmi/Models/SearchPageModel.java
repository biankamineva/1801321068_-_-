package uni.pl.fmi.Models;

import uni.pl.fmi.services.SearchService;

public class SearchPageModel {

	private String name;
	private String message;

	public void navigatetoSearchScreen() {
		System.out.println("Навигирано е до страницата за търсене.");
		
	}

	public void setName(String name) {
		this.name = name;
		
	}


	public void clickSearchButton() {
		message = SearchService.search(name);
	}
	
	public String getSearchMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
