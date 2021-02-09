package uni.pl.fmi.Models;

import uni.pl.fmi.services.SearchByAutorAndTitleService;

public class SearchByAutorAndTitlePageModel {

	private String name;
	private String message;
	private String autor;

	public void navigatetoSearchByAutorAndTitleScreen() {
		System.out.println("Навигирано е до страницата за разширено търсене.");
		
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setUser(String autor) {
		this.autor = autor;
		
	}


	public void clickSearchByAutorAndTitleButton() {
		message = SearchByAutorAndTitleService.search(name, autor);
	}
	
	public String getSearchByAutorAndTitleMessage() {
		// TODO Auto-generated method stub
		return message;
	}



}
