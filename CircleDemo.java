package hit.day4;
import java.util.Scanner;
public class CircleDemo {
	static Scanner SC=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the radius:");
		/*We are storing the entered radius in double
		 * because a user can enter radius in decimals
		 */
		double radius=SC.nextDouble();
		//area=PI*radius*radius
		double area= Math.PI*(radius*radius);
		System.out.println("The area of circle is"+area);
		//Circumstance=2*PI*radius
		double circumstance=Math.PI*2*radius;
		System.out.println("the circumference of the circle is:"+circumstance);
	}
}
