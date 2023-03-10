public class Exception1{
	public static void main(String args[]){
		try{
		int[] a = {3,6,9};
		System.out.println(a[2]);
		}
		catch(Exception e){
		System.out.println("something wrong");
		}
	}
}