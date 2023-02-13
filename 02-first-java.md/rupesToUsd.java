import java.util.Scanner;
public Class rupesToUsd{
    public static void main(String[] args) {
        //Input currency in rupees and output in USD.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter rupees: ");
		float rupees = input.nextFloat();

        System.out.println(" rupees change to USD is: "+ (rupees/64));
        

	}
}