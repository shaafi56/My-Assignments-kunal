import java.util.Scanner;
public class areaOfCircle{
    public static void main(String[] args) {
        //area of circle
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("enter the radius: ");
		float r = input.nextFloat();
        
        double area = pi * r * r;
        
        System.out.println("the area of circle is: "+ area);
        

	}
}