class Human{
	void showhuman(){
	System.out.println("Invoking show human method");
	}
}
	interface father{
		void show();
	}
	interface mother{
		void show();
	}
class Child extends Human implements father, mother{
	public void show(){
		System.out.println("Invoking showchild");
	}
}
class HybridExample extends Child{
	public static void main(String args[]){
		Child obj = new Child();
		obj.showhuman();
		obj.show();
	}
}
	
