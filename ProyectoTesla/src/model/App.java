package model;

import java.util.ArrayList;

public class App {

	private ArrayList<User> users;
	private ArrayList<TeslaCar> teslaCars;
	private ArrayList<OtherCar> otherCars;
	private User actualUser;
	private TeslaCar actualTesla;
	private OtherCar actualOtherCar;

	
	
	public App() {
		users = new ArrayList<User>();
		teslaCars = new ArrayList<TeslaCar>();
		otherCars = new ArrayList<OtherCar>();
		actualUser = null;
	}

	public ArrayList<User> getUsers() {
		return users;
	}
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	public ArrayList<TeslaCar> getTeslaCars() {
		return teslaCars;
	}
	public void setTeslaCars(ArrayList<TeslaCar> teslaCars) {
		this.teslaCars = teslaCars;
	}
	public ArrayList<OtherCar> getOtherCars() {
		return otherCars;
	}
	public void setOtherCars(ArrayList<OtherCar> otherCars) {
		this.otherCars = otherCars;
	}

	public boolean logIn(String username, String Password){
		boolean r = false;
		return r;
	}
	

	public boolean signUp(String username, String Password,String email){
		boolean r = false;
		return r;
	}
	
	public boolean newCreditCard(String name, String number,int cvv, String expDate){
		boolean r = false;
		return r;
	}
	
	public boolean buyActualCar(){
		boolean r = false;
		return r;
	}
	
	
	
	
}
