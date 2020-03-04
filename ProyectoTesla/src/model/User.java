package model;

import java.util.ArrayList;

public class User {

	private String nickname;
	private String password;
	private String email;
    private CreditCard[] creditCars;
    private ArrayList<ShopHistory> history;
    
    
	public User(String nickname, String password, String email) {
		super();
		this.nickname = nickname;
		this.password = password;
		this.email = email;
		this.creditCars = new CreditCard[3];
		this.history = new ArrayList<ShopHistory>();
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public CreditCard[] getCreditCars() {
		return creditCars;
	}


	public void setCreditCars(CreditCard[] creditCars) {
		this.creditCars = creditCars;
	}


	public ArrayList<ShopHistory> getHistory() {
		return history;
	}


	public void setHistory(ArrayList<ShopHistory> history) {
		this.history = history;
	}
	
	
	

}
