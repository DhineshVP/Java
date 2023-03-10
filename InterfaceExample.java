interface printable{
	void print();
}
class InterfaceExample implements printable{
	public void print(){
	System.out.println("Using interface program is achieved");
	}
public static void main(String args[]){
	InterfaceExample obj = new InterfaceExample();
	obj.print();
}
}