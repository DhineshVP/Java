import java.util.*;
class LinkedHashMapSample{
	public static void main(String args[]){
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
			hm.put(111,"Vishnu");
			hm.put(222,"Soundhar");
			hm.put(null,"Dhinesh");

	for(Map.Entry m:hm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}