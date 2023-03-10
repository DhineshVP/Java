class A extends Thread{
	public void run(){
		int a = 9, b = 3;
		System.out.println("Thread A - Addition"+(a+b));
	}
}
class B extends Thread{
	public void run(){
		int a = 9, b = 3;
		System.out.println("Thread B - Subraction"+(a-b));
	}
}
class C extends Thread{
	public void run(){
		int a = 9, b = 3;
		System.out.println("Thread C - Multiplication"+(a+b));
	}
}
class D extends Thread{
	public void run(){
		int a = 9, b = 3;
		System.out.println("Thread A - Division"+(a/b));
	}
}
class DemoMultithread{
	public static void main(String args[]){
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		a1.start();
		b1.start();
		c1.start();
		d1.start();
	}
}