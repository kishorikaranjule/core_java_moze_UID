
public class Student {
	
	private int rollNo;
	private String name;
	private static int count;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		count++;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	public String toString()
	{
		return "Student [rollNo=" + rollNo +"," + "name=" + name + "]";
	}
	
	static //static block
	{
		System.out.println("Static block invoked");
		count = 60;
	}

	public static void main(String[] args) {
	 System.out.println("In main method---->");
	 Student s1 = new Student(1,"Kishori");
	 System.out.println(s1);//toString
     Student s2 = new Student(2,"Jayshree");
     System.out.println(s2);
     
     //Classname.static_method_name;
     System.out.println("Student Count = "+Student.getCount());
	}

}
