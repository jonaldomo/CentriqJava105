package thursday.interfaces;

public class Car implements ITurn, IMotorized {
	private String model;
	
	public Car() {
		this("Accord");
	}
	public Car(String _model) {
		this.setModel(_model);
	}
	
	@Override
	public void startEngine() {
		System.out.println("Car engine started.");
	}
	@Override
	public void stopEngine() {
		System.out.println("Car engine stopped.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.startEngine();
		myCar.turn(Direction.AROUND);
		myCar.stopEngine();
	}

	@Override
	public void turn(Direction _direction) {
		System.out.println(this.getModel() + " turning " + _direction + ".");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
