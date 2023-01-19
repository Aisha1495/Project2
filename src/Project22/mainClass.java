package Project22;

public class mainClass {

	public static void main(String[] args) {
		// TODO System for Vehical
		Vehical v1 = new Vehical();
		v1.strat();
		v1.drive(55);
		v1.honk();
		v1.stop();
		
		ElectricVehicle ev1= new ElectricVehicle();
		ev1.charge(58);
		ev1.drive(99);
		

	}

}
