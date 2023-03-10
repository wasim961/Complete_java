package Variables;

public class Instance_Variable {
	
	public String name;
	
	private double salary;
	
	public Instance_Variable(String empName) {
		name = empName;
	}
	
	public void setSallary(double empSal) {
		salary = empSal;
	}
	
	public void printEmp() {
		System.out.println("name : "+name);
		System.out.println("salary : "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instance_Variable employee = new Instance_Variable("Alex");
		employee.setSallary(10000);
		employee.printEmp();
	}

}
