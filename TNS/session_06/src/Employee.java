
public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee()
	{
		this(111,"kishori",567545.98);
		System.out.println("Default constructor called");
		empId = 1;
		empName = "Jayshree";
		empSalary = 75746.9;
	}

	public Employee(int empId, String empName, double empSalary) {
		 //this();
		System.out.println("Parameterized constructor called");
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public void display()
	{
		System.out.println("Employee = "+empId+" "+empName+" "+" "+empSalary);
	}

	public static void main(String[] args) {
		
//		Employee e = new Employee(111,"kishori",1200.78);
//		e.display();
	 
         Employee e = new Employee();
         e.display();
	}

}
