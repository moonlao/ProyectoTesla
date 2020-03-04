package model;

public class OtherCar extends Car {

	private String brand;
	private boolean electric;
	
	
	public OtherCar(String name, double price, double acceleration, double efficiency, int topSpeed, double power, String brand, boolean electric) {
		super(name, price, acceleration, efficiency, topSpeed, power);
		this.brand = brand;
		this.electric=electric;
	
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public boolean isElectric() {
		return electric;
	}


	public void setElectric(boolean electric) {
		this.electric = electric;
	}

	
	
}
