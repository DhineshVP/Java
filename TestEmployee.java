class Employee{
	int id;
	String name;
	float salary;
	Employee(int i, String n, float s){
	id = i;
	name = n;
	salary = s;
	}
	void display(){
	System.out.println(id+" "+name+" "+salary);
	}
}
public class TestEmployee{
	public static void main(String args[]){
		Employee e1 = new Employee(111,"Vishnu",3000);
		Employee e2 = new Employee(222,"Soundar",6000);
		Employee e3 = new Employee(333,"Dhinesh",9000);
		e1.display();
		e2.display();
		e3.display();
	}
}