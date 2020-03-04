package model;

public class Car {

	
	private String name;
	private double price;
	private double acceleration;
	private double efficiency;
    private int topSpeed;
    private double power;


	public Car(String name, double price, double acceleration, double efficiency, int topSpeed, double power) {
		super();
		this.name = name;
		this.price = price;
		this.acceleration = acceleration;
		this.efficiency = efficiency;
		this.topSpeed = topSpeed;
		this.power = power;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getAcceleration() {
		return acceleration;
	}


	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}


	public double getEfficiency() {
		return efficiency;
	}


	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}


	public int getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}


	public double getPower() {
		return power;
	}


	public void setPower(double power) {
		this.power = power;
	}

	
	
	
}
