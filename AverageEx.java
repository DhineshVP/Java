import java.util.*;
class AverageEx{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 'a' value");
	int a = input.nextInt();
	System.out.println("Enter 'b' value");
	int b = input.nextInt();
	System.out.println("Enter 'c' value");
	int c = input.nextInt();
	System.out.println("Enter 'd' value");
	int d = input.nextInt();
	System.out.println("Enter 'e' value");
	int e = input.nextInt();
	int avg = (a+b+c+d+e)/5;
	System.out.println("Average is:" +avg);
	}
}