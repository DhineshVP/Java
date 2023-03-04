import java.util.*;
class Vowel{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter letter");
	String letter = input.next();

if(letter =="a"||letter =="e"||letter =="i"||letter =="o"||letter =="u"){
	System.out.println("vowel");
}
else{
	System.out.println("consonent");
}
}
}