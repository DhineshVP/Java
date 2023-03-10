import java.util.*;
class Dhinesh{
	int a;
	int b;
	public void calc(int a, int b){
	this.a=a;
	this.b=b;
	}
	void addition(){
	System.out.println("Addition :" +(a+b));
	}
	void subraction(){
	System.out.println("subraction :" +(a-b));
	}
	void multiple(){
	System.out.println("multiple :" +(a*b));
	}
	void division(){
	System.out.println("division :" +(a/b));
	}
}
class CalcSample2{
	public static void main(String args[]){
	Dhinesh obj = new Dhinesh();
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a value");
	obj.a = input.nextInt();
	System.out.println("Enter b value");
	obj.b = input.nextInt();
	obj.addition();
	obj.subraction();
	obj.multiple();
	obj.division();

}
}