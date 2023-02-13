import java.util.Scanner;
public Class condition{
    public static void main(String[] args) {
        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
		Scanner input = new Scanner(System.in);

        
        System.out.println("Please enter number one:");
		float num1 = input.nextFloat();

        System.out.println("Please enter number two:");
		float num2 = input.nextFloat();

        System.out.println("Please enter operator:");
		char operator = input.next().charAt(0);

        if(operators == '+'){
            ystem.out.println(" two number add results is: "+ (num1 + num2));
        }
        else if(operators == '-'){
            ystem.out.println(" two number substruct results is: "+ (num1 - num2));
        }
        else if(operators == '*'){
            ystem.out.println(" two number multiplication results is: "+ (num1 * num2));
        }
        else if(operators == '/'){
            ystem.out.println(" two number divided results is: "+ (num1 / num2));
        }
        
	}
