class Add1{
	String str = "Addition";
	void addition(){
	System.out.println(str + " " +(10+15));
	}
}
class Add2 extends Add1{
	String str = "Duplicate value";
	void addition(){
	int c = 5+10;
	System.out.println(super.str + " " +c);
	super.addition();
	}
}
class Add3 extends Add2{
	public static void main(String args[]){
	Add3 obj = new Add3();
	obj.addition();
	}
}