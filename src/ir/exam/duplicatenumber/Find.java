package ir.exam.duplicatenumber;

import java.util.HashSet;
import java.util.Set;

public class Find {

	public void findDuplicateNumber(int[] numbers) {
		Set<Integer> numbers2 = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			if (!numbers2.add(numbers[i]))
				System.out.println("duplicate number is:" + numbers[i]);
		}
	}
}
