import java.util.LinkedList;
import java.util.List;

public class TotalSumListValues {

	public static void main(String[] args) {
		// Getting the sum of all items in a List using java streams
		List<Integer> bill = new LinkedList<Integer>();
		int sum = bill.stream().mapToInt(Integer::intValue).sum();
	}

}
