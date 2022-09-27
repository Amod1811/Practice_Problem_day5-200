package day5problem;

import java.util.Scanner;

/*
 * check number is odd or even
 */

public class EvenOddNumber {
	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is Odd");
		}
	}
}
