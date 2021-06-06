package hit.day4;

public class SwapTwoNumbers {
	public static void main(String[]args) {
		int first=120, second=220;
		System.out.println("--Before swap--");
		System.out.println("First number="+first);
		System.out.println("Second number="+second);
		//value of first is assigned to temporary
		float temporary=first;
		//value of second is assigned to first
		first=second;
		//value of temporary(which contains the initial value of first) is assigned to second
		second=(int) temporary;
		System.out.println("--After swap--");
		System.out.println("First number="+first);
		System.out.println("Second number="+second);
	}

}
