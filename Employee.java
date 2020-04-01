
public class Employee extends Person{
	
	private int empId;

	public Employee(String nm, String gen, int id) {
		super(nm, gen);
		this.empId= id;
		
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("this method will define the implementation of an employee");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personObject = new Employee("Mr.", "Smith", 123);
		Person personObject2 = new Employee("Mr.James", "Bond", 007);
		
		//Employee employeeObject= new Employee("Mr. ","Employee", 8);
		
		//personObject.work();
		//personObject2.work();
		
		System.out.println(personObject2.toString());
		System.out.println(personObject.toString());
		//System.out.println(employeeObject.toString());

	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", toString()=" + super.toString() + "]";
	}



}
