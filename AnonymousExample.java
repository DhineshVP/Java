class AnonymousExample{
	int a = 10, b = 5;
	public void addition(){
	System.out.println(a+b);
	}
	public static void main(String args[]){
		AnonymousExample obj = new AnonymousExample();
		new AnonymousExample().addition();
	}
}