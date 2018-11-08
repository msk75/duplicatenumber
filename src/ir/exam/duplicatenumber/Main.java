package ir.exam.duplicatenumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Find find=new Find();
		System.out.println("Enter Number(n+1) of elements:");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int[] numbers = new int[i];
		int ii=i-1;
		System.out.println("Enter the numbers of array from 1 to "+ ii +" :");
		for (int j = 0; j < i; j++)
			numbers[j] = scanner.nextInt();
		find.findDuplicateNumber(numbers);
	}

}
