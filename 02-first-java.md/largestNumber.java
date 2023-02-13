import java.util.Scanner;
public Class largestNumber{
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number one: ");
		float num1 = input.nextFloat();

        System.out.println("Please enter number two: ");
		float num2 = input.nextFloat();

        if(num1 > num2){
            System.out.println(" the greatest number is "+num1);
        }
        

	}
}