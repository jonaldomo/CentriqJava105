package thursday.interfaces;

public class Driver {
	private ITurn vehicle;
	
	public void drive(Direction[] directions) {
		for(int i = 0; i < directions.length; i++) {
			this.getVehicle().turn(directions[i]);
		}
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		Driver myDriver = new Driver();
		myDriver.setVehicle(myCar);
		Direction[] myDirections = {Direction.AROUND, Direction.RIGHT, Direction.LEFT};
		myDriver.drive(myDirections);
	}

	public ITurn getVehicle() {
		return vehicle;
	}

	public void setVehicle(ITurn vehicle) {
		this.vehicle = vehicle;
	}
}
