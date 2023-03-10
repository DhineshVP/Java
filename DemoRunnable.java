class Batch13 implements Runnable{
	public void run(){
		int a = 6, b = 3;
		System.out.println("Thread Batch13"+(a*b));
	}
}
class DemoRunnable{
	public static void main(String args[]){
		Batch13 obj = new Batch13();
		Thread t1 = new Thread(obj);
		t1.start();
	}
}