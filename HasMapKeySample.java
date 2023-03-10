import java.util.*;
class HasMapKeySample{
	public static void main(String args[]){
	Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(111,"Vishnu");
		map.put(222,"Soundhar");
		map.put(333,"Dhinesh");
		map.put(222,"Rajan");
	map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	}
}