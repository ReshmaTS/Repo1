package inheritancePrgm;

public class ChildClass extends MainClass {
	public  void leaves()
	{
		System.out.println("leaves are green");
	}

	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass();
		obj.flowers();
		obj.leaves();
	}

}
