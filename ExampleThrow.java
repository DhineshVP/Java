import com.dhineshvp.Class1;
public class ExampleThrow{
	public static void validate(int age){
		if(age<=18){
		throw new ArithmeticException("Thambi nee innum valaranum!!");
		} else{
		System.out.println("Alright!! mark your presence to change the world on 12-10-2023");
		}
	}
	public static void main(String args[]){
		validate(13);
		System.out.println("Main Method");
		Class1 obj1 = new Class1();
		obj1.method1();
	}
}