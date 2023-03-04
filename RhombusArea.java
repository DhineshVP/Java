import java.util.*;
class RhombusArea{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter 1st diagonal value");
int p = input.nextInt();

System.out.println("Enter 2nd diagonal value");
int q = input.nextInt();

System.out.println("Area of Rhombus is: " + p*q/2);
}
}