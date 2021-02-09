package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pl.fmi.User;

public class LoginService {

	public static String login(String username, String password) {
		if (username == null && password == null) {
			return "Моля въведете име и парола!";
		}
		if (username == null) {
			return "Моля въведете име!";
		}
		if (password == null) {
			return "Моля въведете парола!";
		}
		List<User> users = getUsers();
		final boolean isUserMatch = users.stream().anyMatch(user->username.equals(user.getUsername())&&password.equals(user.getPassword()));
		return isUserMatch? "Успешно влизане" : "Грешно име/парола" ;
	}
	 
	private static List<User> getUsers(){
		User user = new User();
		user.setPassword("pass");
		user.setUsername("bibi");
		final List<User> result = new ArrayList<>();
		result.add(user);
		return result;
	}
	
}
