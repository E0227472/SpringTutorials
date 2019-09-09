import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {

	public static void main(String[] args) {
		// converting an array to list using java 8 streams
		int [] arr = new int[] {1,2};
		List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
	}

}
