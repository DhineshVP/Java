import java.util.*;
public class TestVector{
	public static void main(String args[]){
	Vector<String> v = new Vector<String>();
	v.add("Dhinesh");
	v.add("Vishnu");
	v.add("Soudar");
	v.add("Abinesh");
Iterator<String> itr = v.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
		}
	}
}