package Project22;

public class ElectricVehicle extends Vehical{
	
	private Integer batteryCapacity;
	private Integer chargeLevel;
	
	
	public Integer getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(Integer batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	public Integer getChargeLevel() {
		return chargeLevel;
	}

	public void setChargeLevel(Integer chargeLevel) {
		this.chargeLevel = chargeLevel;
	}

	public void charge(int chargeLevel) {
		if(chargeLevel>0) {
			System.out.println("Charged Increses");
		}
		
	}
	
	public void drive(int speed) {
		System.out.println("Electric vehicle drived " + speed + " mailes");
	}
	
	}
	
 

