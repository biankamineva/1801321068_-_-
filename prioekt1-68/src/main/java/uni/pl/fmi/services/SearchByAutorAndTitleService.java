package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pl.fmi.Novel;

public class SearchByAutorAndTitleService {
	public static String search(String name, String autor) {
		
		if (name == null && autor == null) {
			return "Моля въведете заглавие и автор!";
		}
		if (name == null ) {
			return "Моля въведете заглавие!";
		}
		if (autor == null) {
			return "Моля въведете автор!";
		}
		
		List<Novel> novels = getNovels();
		final boolean isNovelMatch = novels.stream().anyMatch(novel->name.equals(novel.getName())&&autor.equals(novel.getAutor()));
		return isNovelMatch? "Търсенето е успешно!" : "Търсенето е неуспешно!" ;
	}
	 
	private static List<Novel> getNovels(){
		Novel novel = new Novel();
		novel.setName("Your name.");
		novel.setAutor("bibi");
		final List<Novel> result = new ArrayList<>();
		result.add(novel);
		return result;
	}
	

}
