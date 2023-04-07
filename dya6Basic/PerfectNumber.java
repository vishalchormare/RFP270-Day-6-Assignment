package dya6Basic;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number for checking perfect number");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++) {

			if (num % i == 0) {

				sum = sum + i;
			}
		}
		if (num == sum) {
			System.out.println(num + " " + "is Perfect Number");
		} else {
			System.out.println(num + " " + "is Not" + " Perfect Number");
		}
	}

}
