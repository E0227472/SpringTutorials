import java.util.Map;
import java.util.TreeMap;

public class IteratingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Iterating through keys and values of a map.
		Map<Integer, Integer> arrayElements = new TreeMap<Integer, Integer>();
		
		for (Map.Entry<Integer, Integer> val : arrayElements.entrySet()) {
			int value = val.getValue();
			System.out.println("The frequencies of " + val.getKey() + " are: " + value);
			arrListOccurance.add(value);
		}
	}

}
