package Project22;

public class truck extends Vehical {
	
	private Integer numberOfAxles;
	private int capacityInTons;
	
	
	public int getCapacityInTons() {
		return capacityInTons;
	}


	public void setCapacityInTons(int capacityInTons) {
		this.capacityInTons = capacityInTons;
	}


	public Integer getNumberOfAxles() {
		return numberOfAxles;
	}


	public void setNumberOfAxles(Integer numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}



	public void load(int weight) {
		if(weight<capacityInTons) {
			System.out.println("Loaded "+ weight +" tons");
		}
		else {
			System.out.println("Over weight");
		}
	}
	}


