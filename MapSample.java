import java.util.*;
class MapSample{
	public static void main(String args[]){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(111,"Vishnu");
		map.put(222,"Soundhar");
		map.put(333,"Dhinesh");
		map.put(333,"Dhinesh");
	for(Map.Entry m:map.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}