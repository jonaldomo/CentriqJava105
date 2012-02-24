package tuesday;

import java.util.Random;

public class MathTests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("E is " + MathTests.getE());
		System.out.println("Pi is " + MathTests.getPi());
		System.out.print("Twenty random numbers: ");
		for (int i = 0; i < 20; i++) {
			System.out.print(MathTests.getRandom(10) + " ");
		}
		System.out.println();
		System.out.println("Area of a circle with a radius of 5.0 is " + MathTests.calculateAreaCircle(5.0));
		System.out.println("Volume of a sphere with a radius of 5.0 is " + MathTests.calculateSphereVolume(5.0));
		
		Random generator = new Random();
		System.out.print("Twenty random numbers: ");
		for (int i = 0; i < 20; i++) {
			System.out.print(generator.nextInt(20) + " ");
		}
	}
	
	public static long getRandom(int maximum){
		return Math.round(Math.random() * (maximum + 1));
	}
	
	public static double calculateAreaCircle(double radius){
		return Math.pow(radius, 2) * MathTests.getPi();
	}
	
	public static double getPi(){
		return Math.PI;
	}
	
	public static double getE(){
		return Math.E;
	}
	
	public static double calculateSphereVolume(double radius){
		return (4.0 / 3) * MathTests.getPi() * Math.pow(radius, 3);
	}

}
