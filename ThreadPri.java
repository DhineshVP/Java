class A extends Thread
{
	public void run()
	{
		int a=8,b=2;
		System.out.println("Thread A Addition:   "+(a+b));

	}
}
class B extends Thread
{
	public void run()
	{
		int a=8,b=2;
		System.out.println("Thread B Subtraction:   "+(a-b));

	}
}
class C extends Thread
{
	public void run()
	{
		int a=8,b=2;
		System.out.println("Thread C Multiplication:   "+(a*b));

	}
}
class ThreadPri
{
		public static void main(String ag[])
		{

			A a1 = new A();
			B b1 = new B();
			C c1 = new C();


			c1.setPriority(Thread.MAX_PRIORITY);
			b1.setPriority(a1.getPriority()+1);
			a1.setPriority(Thread.MIN_PRIORITY);


			c1.start();
			b1.start();
			a1.start();
	}
}













