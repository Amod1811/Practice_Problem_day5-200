package day5problem;
import java.util.Scanner;
import java.util.function.Function;

/*
 * calculate the quotient and remainder
 */


public class QuotientRemainder {
	public static void main(String[] args) {
		System.out.println("Enter dividend number: ");
       
        Scanner sc =new Scanner(System.in);
       int dividend=  sc.nextInt();
       System.out.println("Enter divisior number: ");
       Scanner scanner =new Scanner(System.in);
      int divisor= scanner.nextInt();
		 

	    int quotient =dividend / divisor;
	    int remainder =dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);

	}
}

		