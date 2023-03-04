import java.util.*;
class VolumeCylinder{
public static void main(String[] args){
double pie = 3.14285714286;
Scanner value = new Scanner(System.in);
System.out.println("Enter Radius Value");
int r = value.nextInt();
System.out.println("Enter Height Value");
int h = value.nextInt();

double volume = pie*r*r*h;
System.out.println("Volume of Cylinder is:" + volume);
}
}