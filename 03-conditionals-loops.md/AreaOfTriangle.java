import java.util.Scanner;
public class areaOfCircle{
    public static void main(String[] args) {
        //area of circle
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter the hieght of triangle: ");
		float b = input.nextFloat();
		
		System.out.println("enter the base of triangle: ");
		float h = input.nextFloat();
        
        double area = ( b * h)/2;
        
        System.out.println("the area of triangle is: "+ area);
        

	}
}