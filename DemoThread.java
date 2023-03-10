class Batch13 extends Thread{
	public void run(){
		int a = 6, b = 3;
		System.out.println("Thread Batch13"+(a+b));
	}
}
class DemoThread{
	public static void main(String args[]){
		Batch13 obj = new Batch13();
		obj.start();
	}
}