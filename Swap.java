import java.util.*;
class Swap{
	public static void main(String args[]){
		int a,b,c;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter value of a and b");
		a = input.nextInt();
		b = input.nextInt();
			c = a;
			a = b;
			b = c;
	System.out.println("a value:" +a);
	System.out.println("b value:" +b);
	}
}