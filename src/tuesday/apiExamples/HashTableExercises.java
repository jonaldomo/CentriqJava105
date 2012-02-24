package tuesday.apiExamples;

import java.util.Hashtable;

/**
 * a controller that plays with the hashtable api.
 * not part of centriq java 105, but something i wanted to add.
 * @author Student
 *
 */
public class HashTableExercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
		HashTableExercises.initialize(numbers);
		
		System.out.println("Hashtable toString returns " + numbers.toString());
		
		Integer n = (Integer)numbers.get("two");
		System.out.println(n);
		
		System.out.println("Hashcode of our hashtable is " + numbers.hashCode());
		
		System.out.println("Size of our numbers hashtable is " + numbers.size());
		System.out.println(HashTableExercises.isEmpty(numbers));
		numbers.clear();
		System.out.println("Clearing our numbers hashtable.");
		System.out.println(HashTableExercises.isEmpty(numbers));
		System.out.println("Size of our numbers hashtable is " + numbers.size());
		
		HashTableExercises.initialize(numbers);
		System.out.println("Size of our numbers hashtable is " + numbers.size());
		System.out.println(HashTableExercises.isEmpty(numbers));
		
		System.out.println("Removing the key 'three' and its value");
		numbers.remove("three");
		System.out.println("Size of our numbers hashtable is " + numbers.size());
		
		Hashtable<String, Integer> numbersCopy = new Hashtable<String, Integer>();
		System.out.println("Size of our numbers copy hashtable is " + numbersCopy.size());
		System.out.println(HashTableExercises.isEmpty(numbersCopy));
		
		System.out.println("Copying our numbers to numbers copy hashtable");
		numbersCopy.putAll(numbers);
		System.out.println("Size of our numbers copy hashtable is " + numbersCopy.size());
		System.out.println(HashTableExercises.isEmpty(numbersCopy));
		
		System.out.println(HashTableExercises.isEqual(numbers, numbersCopy));
		
		HashTableExercises.addKeyValue(numbers, "four", new Integer(4));
		System.out.println(HashTableExercises.isEqual(numbers, numbersCopy));

	}
	
	public static String isEmpty(Hashtable<?, ?> toCheck){
		return (toCheck.isEmpty()) ? "Hashtable is empty" : "Hashtable is not empty";
	}
	
	public static String isEqual(Hashtable<?, ?> first, Hashtable<?, ?> second){
		return (first.equals(second)) ? "Hashtables are equal" : "Hashtables are not equal";
	}
	
	public static void addKeyValue(Hashtable <String, Integer> hashTable, String key, Integer value){
		System.out.println("Adding <" + key + ", " + value.toString() + "> to Hashtable");
		hashTable.put(key, value);
	}
	
	public static void initialize(Hashtable <String, Integer>numbers){
		System.out.println("Initializing our hashtable");
		numbers.put("one", new Integer(1));
		numbers.put("two", new Integer(2));
		numbers.put("three", new Integer(3));
	}

}
