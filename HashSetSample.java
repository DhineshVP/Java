import java.util.*;
public class HashSetSample{
	public static void main(String args[]){
	HashSet<String> set = new HashSet<String>();
	set.add("Dhinesh");
	set.add("Dhinesh");
	set.add("Vishnu");
	set.add("Soundhar");
Iterator<String> itr = set.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
		}
	}
}