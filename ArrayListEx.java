import java.util.*;
class ArrayListEx{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Dhinesh");
		list.add("Vishnu");
		list.add("Soundar");
		list.add("Vishnu");
	Iterator itr = list.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}