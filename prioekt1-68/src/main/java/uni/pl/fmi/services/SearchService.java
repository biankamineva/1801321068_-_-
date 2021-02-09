package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pl.fmi.Novel;

public class SearchService {

	public static String search(String name) {
		
		if (name == null) {
			return "Моля въведете заглавие!";
		}
		
		List<Novel> novels = getNovels();
		final boolean isNovelMatch = novels.stream().anyMatch(novel->name.equals(novel.getName()));
		return isNovelMatch? "Търсенето е успешно!" : "Търсенето е неуспешно!" ;
	}
	 
	private static List<Novel> getNovels(){
		Novel novel = new Novel();
		novel.setName("Your name.");
		final List<Novel> result = new ArrayList<>();
		result.add(novel);
		return result;
	}
	

}
