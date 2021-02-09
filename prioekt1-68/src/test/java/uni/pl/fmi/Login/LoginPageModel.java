package uni.pl.fmi.Login;

import uni.pl.fmi.services.LoginService;

public class LoginPageModel {

	private String username;
	private String password;
	private String message;

	public void navigatetoLoginScreen() {
		System.out.println("Навигирано е до страницата за вход.");
		
		
	}

	public void setUsername(String username) {
		this.username = username; 
		
	}

	public void setPassword(String password) {
		this.password = password ;
		
	}

	public void clickLoginButton() {
		message = LoginService.login(username, password);
		
	}

	public String getLoginMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
