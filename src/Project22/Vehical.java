package Project22;

public class Vehical extends Engine implements Honkable {

		// TODO Auto-generated method stub
		private String make;
		private String modle;
		private Integer year;
		private String color;
		private Integer numOfWeels;
		private Integer weight;
		

		public void strat() {
			System.out.println("Vehicle Started");
		}

		public void stop() {
			System.out.println("Vehicle Stopped");
		}
		
		public void drive(int speed) {
			System.out.println("Vehicle speed " + speed + " mailes");
		}
		
		public void honk() {
			System.out.println("Honk Honk!");
			
		}
		
		

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModle() {
			return modle;
		}

		public void setModle(String modle) {
			this.modle = modle;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Integer getNumOfWeels() {
			return numOfWeels;
		}

		public void setNumOfWeels(Integer numOfWeels) {
			this.numOfWeels = numOfWeels;
		}

		public Integer getWeight() {
			return weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

	}


