import java.util.*;
class IfSample{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter your mark");
int mark = input.nextInt();

if(mark>34){
System.out.println("Pass"); 
if(34<mark&mark<61){
System.out.println("Secomd class");
}else if(60<mark&mark<80){
System.out.println("First class");
}else if(101>mark&mark>79){
System.out.println("Distinction");
}
}else if(mark<35){
System.out.println("Fail");
}else{
System.out.println("Absents");
}
}
}