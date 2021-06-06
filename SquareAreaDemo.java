package hit.day4;
import java.util.Scanner;
public class SquareAreaDemo {
	public static void main(String[] args) {
		System.out.println("Enter side of square:");
		//Capture the user's input
		Scanner scanner=new Scanner(System.in);
		//Storing the captured value in a variable
		double side=scanner.nextDouble();
		//Area of square=side*side
		double area=side*side;
		System.out.println("Area of square is:"+area);
	}
}
