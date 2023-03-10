import java.util.*;
public class TreeSetEx{
	public static void main(String args[]){
	TreeSet<String> set = new TreeSet<String>();
		set.add("Dhinesh");
		set.add("Vishnu");
		set.add("Prakash");
		set.add("Soundhar");
		set.add("Soundhar");
	Iterator<String> itr = set.iterator();
	System.out.println(set);
	//Collections.sort(set, Collections.reversOrder());
while(itr.hasNext()){
	System.out.println(itr.next());
		}
	}
}