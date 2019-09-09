import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// Converting list to java array using java streams 
		List<Integer> sumArray = new ArrayList<Integer>();
		int sum[] = sumArray.stream().mapToInt(i -> i).toArray();
	}

}
