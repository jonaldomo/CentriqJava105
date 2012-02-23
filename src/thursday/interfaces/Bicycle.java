package thursday.interfaces;

public class Bicycle implements ITurn{
	private String handlebarType;
	
	public void brake() {
		System.out.println("Bicycle brake applied.  Bicycle stopped.");
	}
	
	public static void main(String[] args) {
		Bicycle myBicycle = new Bicycle();
		myBicycle.setHandleBar("Racing");
		myBicycle.turn(Direction.LEFT);
	}

	@Override
	public void turn(Direction _direction) {
		System.out.println("Applying pressure to the " + this.getHandleBar() + " handlebars.");
		System.out.println("Bicycle turning " + _direction);
	}

	private void setHandleBar(String _handleBarType) {
		this.handlebarType = _handleBarType;
	}
	private String getHandleBar() {
		return this.handlebarType;
	}

}
