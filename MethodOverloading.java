class MethodOverloading{
	public void m1(int a, int b){
	System.out.println(a+b);
	}
	public void m1(int c, String d){
	System.out.println(c+" "+d);
	}
	public void m1(int a, int b, int c){
	System.out.println(a+b+c);
	}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Stringn value");
	String g = sc.nextLine();
	System.out.println("Enter Stringn value");
	String a = sc.nextLine();
	System.out.println("Enter Stringn value");
	String b = sc.nextLine();
	System.out.println("Enter Stringn value");
	String c = sc.nextLine();
	System.out.println("Enter Stringn value");
	String d = sc.nextLine();
	System.out.println("Enter Stringn value");
	String e = sc.nextLine();
	System.out.println("Enter Stringn value");
	String f = sc.nextLine();

	MethodOverloading obj = new MethodOverloading();
	obj.m1(4,3);
	obj.m1(3,"Vishnu");
	obj.m1(3,6,9);
	}
}