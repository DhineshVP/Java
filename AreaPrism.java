import java.util.*;
class AreaPrism{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a value");
int a = input.nextInt();
System.out.println("Enter b value");
int b = input.nextInt();
System.out.println("Enter h value");
int h = input.nextInt();
int area = a*b*h;
System.out.println("Area of Prism is: " + area);
}
}