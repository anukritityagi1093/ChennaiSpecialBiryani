import java.util.Scanner;

public class Calculate {
	
	public static int add(int x, int y) {
		System.out.println("Hii");
		return x+y;
	}
	
	public static int sub(int x, int y) {
		return x-y;
	}
	
	public static int mul(int x, int y) {
		return x*y;
	}
	
	public static int div(int x, int y) {
		System.out.println("hhh");
		return x/y;
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		System.out.println(add(x,y));
		System.out.println(sub(x,y));
		System.out.println(mul(x,y));
		System.out.println(div(x,y));
		
	}
}