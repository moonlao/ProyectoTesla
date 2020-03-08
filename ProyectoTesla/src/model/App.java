package model;

import java.util.ArrayList;
import java.util.Date;

public class App {

	private ArrayList<User> users;
	private ArrayList<TeslaCar> teslaCars;
	private ArrayList<OtherCar> otherCars;
	private User actualUser;
	private TeslaCar actualTesla;
	private OtherCar actualOtherCar;
	private CreditCard actualCreditCard;

	
	
	public App() {
		users = new ArrayList<User>();
		teslaCars = new ArrayList<TeslaCar>();
		otherCars = new ArrayList<OtherCar>();
		actualUser = null;
        actualTesla = null;
        actualOtherCar =null;
		actualCreditCard =null;
	}
	
	
	

	public User getActualUser() {
		return actualUser;
	}




	public void setActualUser(User actualUser) {
		this.actualUser = actualUser;
	}




	public TeslaCar getActualTesla() {
		return actualTesla;
	}




	public void setActualTesla(TeslaCar actualTesla) {
		this.actualTesla = actualTesla;
	}




	public OtherCar getActualOtherCar() {
		return actualOtherCar;
	}




	public void setActualOtherCar(OtherCar actualOtherCar) {
		this.actualOtherCar = actualOtherCar;
	}



	public CreditCard getActualCreditCard() {
		return actualCreditCard;
	}



	public void setActualCreditCard(CreditCard actualCreditCard) {
		this.actualCreditCard = actualCreditCard;
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

	//Precondici�n, Parametros no nulos
	public String logIn(String username, String password){
		String r = null;
		for (int i = 0; i < users.size(); i++) {
			if(username.equals(users.get(i).getNickname())) {
				if(password.equals(users.get(i).getPassword())) {
					r="Bienvenido";
                    actualUser =users.get(i);
                    break;
				}
			}else if(actualUser==null) {
				r="El usuario no existe o contrasena es incorrect";
			}
		}
		return r;
	}
	
	//Precondici�n, Parametros no nulos
	public String signUp(String username, String password,String email){
		String r = null;
		for (int i = 0; i < users.size(); i++) {
			if(username.equals(users.get(i).getNickname())) {
				r="El nombre elegido ya existe";
                break;
			}
			if(email.equals(users.get(i).getEmail())) {
				r="El correo electronico ingresado ya esta en uso";
                break;
			}
		}
		if(r==null) {
			if(password.length()<6) {
				r="La contrase�a es muy debil";
			}else {
				User newU = new User(username, password, email);
				users.add(newU);
				actualUser = newU;
			}
		}
		
		return r;
	}
	
	
	
	
	//Precondici�n, Parametros no nulos
	public String newCreditCard(String name, String number,int cvv, String expDate){
		String r = null;
		
		if(actualUser.getCreditCars()[0]!=null){
			if(actualUser.getCreditCars()[0].getCardNumber().equals(number)) {
				r="Ya tienes guardada esa tarjeta!";
			}
		}
		if(actualUser.getCreditCars()[1]!=null){
			if(actualUser.getCreditCars()[1].getCardNumber().equals(number)) {
				r="Ya tienes guardada esa tarjeta!";
			}
		}
		if(actualUser.getCreditCars()[2]!=null){
			if(actualUser.getCreditCars()[2].getCardNumber().equals(number)) {
				r="Ya tienes guardada esa tarjeta!";
			}
		}
		if(r==null) {
			for (int i = 0; i < actualUser.getCreditCars().length; i++) {
				if(actualUser.getCreditCars()[i]==null) {
					CreditCard c = new CreditCard(name, number, cvv, expDate);
					actualUser.getCreditCars()[i]=c;
					r="Tarjeta creada con exito";
				}
			}
			
		}
		if(r==null) {
			r="No puedes guardar mas de 3 tarjetas";
		}
		
		
		return r;
	}
	
	//Precondicion, usuario Logeado
	public void signOut() {
		actualUser=null;
	}
	
	
	//Precondici�n, Parametros no nulos
	public void selectCreditCard(int index) {
		if(actualUser.getCreditCars()[index]!=null) {
			actualCreditCard = actualUser.getCreditCars()[index];
		}
	}
	
	//Precondici�n, Parametros no nulos
		public void deleteCreditCard(int index) {
			actualUser.getCreditCars()[index]=null;
		}
	
	public void buyActualCar(int index){
		selectCreditCard(index);
		Date b = new Date();
		@SuppressWarnings("deprecation")
		ShopHistory a = new ShopHistory(actualCreditCard, actualTesla,b.getDay()+"/"+b.getMonth()+"/"+b.getYear());
		actualUser.getHistory().add(a);
		}
	
	
	
	
}
