
public class Employee {
	
	private String name;
	private String department;
	private double basic;
	
	

	public Employee(String name, String department, double basic) {
		super();
		this.name = name;
		this.department = department;
		this.basic = basic;
	}
	
	public double calculateSalary() {
		double hra = 0.32 * basic;
        double da = 0.45 * basic;
        double pf = 0.25 * basic;
        double net = (basic + hra + da) - pf;
        return net;
	}



	public static void main(String[] args) {
		Employee emp1 = new Employee("Kishori", "HR", 50000);
        System.out.println("Net Salary for " + emp1.name + " is: " + emp1.calculateSalary());

	}

}
