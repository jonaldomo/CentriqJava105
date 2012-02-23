package tuesday.apiExamples;

public class ByteExercises {
	public static void main(String[] args) {
		System.out.println("Byte.MAX_VALUE is " + Byte.MAX_VALUE);
		System.out.println("Byte.MIN_VALUE is " + Byte.MIN_VALUE);
		System.out.println("Byte.TYPE is " + Byte.TYPE);
		
		byte myByte = 127;
		Byte byteA = new Byte(myByte);
		System.out.println("Creating byteA with value of 127");
		System.out.println("byteValue() = " + byteA.byteValue());
		
		byte mySecondByte = -128;
		Byte byteB = new Byte(mySecondByte);
		System.out.println("Creating byteB with a value of -128");
		System.out.println("Comparing byteA to byteB with compareTo() = " + byteA.compareTo(byteB));
		System.out.println("byteA.equals(byteB) = " + byteA.equals(byteB));
		
		Byte myDecodedByte = Byte.decode("10");
		System.out.println("myDecodedByte = " + myDecodedByte);
		System.out.println("myDecodedByte as a double = " + myDecodedByte.doubleValue());
		System.out.println("myDecodedByte as a float = " + myDecodedByte.floatValue());
		System.out.println("myDecodedByte as a int " + myDecodedByte.intValue());
		System.out.println("myDecodedByte as a long " + myDecodedByte.longValue());
		System.out.println("myDecodedByte as a short " + myDecodedByte.shortValue());
		System.out.println("myDecodedByte's hashCode = " + myDecodedByte.hashCode());
		System.out.println("myDecodedByte toString() = " + myDecodedByte.toString()); 
		
	}

}
