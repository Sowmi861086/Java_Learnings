package VeryEasyJavaPrograms;

import java.util.Scanner;

public class PrintTheSameNumberFromUser {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		String s = sc.next();
		//int i=sc.nextInt();
		System.out.println("the output is " + s);
	}

}
