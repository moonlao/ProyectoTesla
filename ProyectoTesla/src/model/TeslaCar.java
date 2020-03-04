package model;

public class TeslaCar extends Car {

	private String autopilotVersion;

	public TeslaCar(String name, double price, double acceleration, double efficiency, int topSpeed, double power,String autopilotVersion) {
		super(name, price, acceleration, efficiency, topSpeed, power);
		this.autopilotVersion = autopilotVersion;
		
	}

	public String getAutopilotVersion() {
		return autopilotVersion;
	}

	public void setAutopilotVersion(String autopilotVersion) {
		this.autopilotVersion = autopilotVersion;
	}

}
