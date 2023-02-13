import java.util.Scanner;
public Class simple_interst{
    public static void main(String[] args) {
        //Take name as input and print a greeting message for that particular name.
		Scanner input = new Scanner(System.in);

        float t, r, si,b;
        System.out.println("Please enter Time:");
		float t = input.nextFloat();

        System.out.println("Please enter the rate:");
		float r = input.nextFloat();

        System.out.println("Please enter the principal amount:");
		float b = input.nextFloat();

        si = (b*t*r)/100;
		System.out.println("Simple interst id" + si);

	}
}