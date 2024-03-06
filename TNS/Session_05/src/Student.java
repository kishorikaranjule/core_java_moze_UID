 

public class Student {
	
	private int rollNo;
	private String name;
	
	public void setRollNo(int r)
	{
		rollNo=r;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();  //Student Object
		s1.setRollNo(10);
		System.out.println("Student rollNo = "+s1.getRollNo());
		s1.setName("Kishori");
		//String nm = s1.getName();     // we can keep getName() into any third variable and then simply call that third variable
		//System.out.println("Student name = "+nm);
		System.out.println("Student Name = "+s1.getName());
	 

	}

}
