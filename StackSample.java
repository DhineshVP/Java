import java.util.*;
public class StackSample{
	public static void main(String args[]){
	Stack<String> stack = new Stack<String>();
	stack.push("Vishnu");
	stack.push("Dhinesh");
	stack.push("Soundhar");
	stack.push("Aravind");
	stack.pop();
	stack.push("Akash");
Iterator<String> itr = stack.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
		}
	}
}