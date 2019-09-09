import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountFrequencyListItems {

	public static void main(String[] args) {
		// Counting the frequency of list items in a list using map
		
		List<Integer> arrListOccurance = new ArrayList<Integer>();

		// hashmap to calcuate the frequence of each element in the array
		Map<Integer, Integer> arrayElements = new TreeMap<Integer, Integer>();
		// arr elements are the key.
		for (int k : arrListOccurance) {
			arrayElements.put(k, (!arrayElements.containsKey(k)) ? 1 : arrayElements.get(k) + 1);
		}

	}

}
