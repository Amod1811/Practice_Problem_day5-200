package day5problem;

import java.util.Scanner;

/*
 * check year is leap year or not
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("please any 4 digit year : ");
		int year = scanner.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println(+year + "year is a leap year");
		else
			System.out.println(+year + " year is not a leap year");
	}

}
