package friday;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsTest {
	public static void main(String[] args) {
		List<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Susan");
		System.out.println(listOfNames);
		List<String> moreNames = new ArrayList<String>();
		moreNames.add("Tom");
		moreNames.add("Bob");
		moreNames.add("Bob");
		listOfNames.addAll(listOfNames.size(), moreNames);
		System.out.println(listOfNames);
		List<String> subsetOfNames = listOfNames.subList(0, 2);
		System.out.println(subsetOfNames);
		Collections.sort(listOfNames);
		System.out.println(listOfNames);
		Collections.shuffle(listOfNames);
		System.out.println(listOfNames);
		Collections.shuffle(listOfNames);
		System.out.println(listOfNames);
		Collections.reverse(listOfNames);
		System.out.println(listOfNames);
		Collections.replaceAll(listOfNames, "Bob", "Alex");
		System.out.println(listOfNames);
		Collection<String> immutableList = Collections.unmodifiableCollection(listOfNames);
		System.out.println(immutableList);
		try{
			immutableList.clear();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Set<String> uniqueNames = new HashSet<String>(listOfNames);
		System.out.println(uniqueNames);
		
		Map<String, Double> nameAndGrades = new HashMap<String, Double>();
		nameAndGrades.put("John", 4.0);
		nameAndGrades.put("Nathan", 2.0);
		System.out.println(nameAndGrades);
	}
}
