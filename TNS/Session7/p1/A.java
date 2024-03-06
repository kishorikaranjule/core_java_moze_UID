package p1;

public class A {
	int no = 10;
	private int a = 100;
	protected float i = 10.2f;
	
	void getNo()
	{
		System.out.println("no = "+no);
	}
	
	public void getMsg()
	{
		System.out.println("Hello World!!!");
	}
	
	private void getA()
	{
		System.out.println("'a = "+a);
	}

	public static void main(String[] args) {
		 A a = new A();
		 System.out.println(a.a);
		 a.getA();
		 System.out.println(a.i);

	}

}
