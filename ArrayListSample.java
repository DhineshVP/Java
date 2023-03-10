import java.util.*;
class ArrayListSample{
	public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter 10 values");
LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
	list.add(sc.nextInt());
Iterator itr = list.iterator();
System.out.println("Values are: ");
while(itr.hasNext()){
	System.out.println(itr.next());
		}
	}
}