import java.util.*;
class ScannerExample{
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
Scanner input1 = new Scanner(System.in);

System.out.println("Enter your Name");
String name = input.nextLine();
System.out.println(name);

System.out.println("Enter your Initial");
String initial = input.next();
System.out.println(initial);

System.out.println("Enter your Number");
long number = input.nextLong();
System.out.println(number);

System.out.println("Enter your E-mail");
String password = input1.nextLine();
System.out.println(password);

}
}