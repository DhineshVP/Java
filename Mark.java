import java.util.*;
class MarkSample{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter your mark");
int mark = input.nextInt();
if(mark>=35){
 System.out.println("Grade C");
}else if(mark>35&&mark<60){
 System.out.println("Grade B");
}else if(mark>59&&mark<=85){
 System.out.println("Grade A");
}else if(mark>85&&mark<101){
 System.out.println("Grade A+");
}
else{
System.out.println("Data not found");
}
}
}