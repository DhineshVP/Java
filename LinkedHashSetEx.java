import java.util.*;
public class LinkedHashSetEx{
	public static void main(String args[]){
	LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Dhinesh");
		set.add("Vishnu");
		set.add("Prakash");
		set.add("Soundhar");
		set.add("Soundhar");
		set.add("");
	Iterator<String> itr = set.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
		}
	}
}