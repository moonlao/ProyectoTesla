package model;

public class ShopHistory {

	private CreditCard card;
	private TeslaCar car;
	private String date;
	
	public ShopHistory(CreditCard card, TeslaCar car, String date) {
		super();
		this.card = card;
		this.car = car;
		this.date = date;
	}
	
	public CreditCard getCard() {
		return card;
	}
	public void setCard(CreditCard card) {
		this.card = card;
	}
	public TeslaCar getCar() {
		return car;
	}
	public void setCar(TeslaCar car) {
		this.car = car;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
