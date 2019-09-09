import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int numsCopy[] = Arrays.copyOf(nums, nums.length);
		Arrays.sort(numsCopy);

		int lowest = 0;
		int highest = nums.length - 1;

		while (lowest < highest) {

			if (numsCopy[lowest] + numsCopy[highest] == target)
				break;
			else if (numsCopy[lowest] + numsCopy[highest] > target)
				highest--;
			else if (numsCopy[lowest] + numsCopy[highest] < target)
				lowest++;
		}

		List<Integer> resultList = new LinkedList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == numsCopy[lowest] || nums[i] == numsCopy[highest]) {
				resultList.add(i);

				if (resultList.size() == 2)
					break;

			}
		}

		int result[] = resultList.stream().mapToInt(i -> i).toArray();

		return result;
	}

	public static void main(String[] args) {

		int nums[] = new int[] { 2, 5, 5, 11 };

		int target = 10;

		int result[] = twoSum(nums, target);

		for (int a : result)
			System.out.println(a);

	}

}
