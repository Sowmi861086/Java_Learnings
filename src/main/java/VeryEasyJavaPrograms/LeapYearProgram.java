package VeryEasyJavaPrograms;

import java.util.Scanner;

public class LeapYearProgram {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an year");
		int year = sc.nextInt();

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {

			System.out.println("the year is leap year");

		} else {
			System.out.println("the year is not leap year");
		}
	}

}
