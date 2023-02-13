import java.util.Scanner;
public Class greeting{
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
		System.out.println("Please enter your name:");

		Scanner input = new Scanner(System.in);
		String name = input.next();

		System.out.println("Hello " + name);

	}
}