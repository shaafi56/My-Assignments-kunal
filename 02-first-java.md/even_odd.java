import java.util.Scanner;

public class odd_even {
	public static void main(String[] args) {
	// 1= Write a program to print whether a number is even or odd, also take input from the user.
	Scanner scanner = new Scanner(System.in);
	System.out.println("Soogali number: ");
	int num = scanner.nextInt();
	
	if(num % 2 == 0)
		System.out.println("even");
	else
		System.out.println("odd");
	}
}