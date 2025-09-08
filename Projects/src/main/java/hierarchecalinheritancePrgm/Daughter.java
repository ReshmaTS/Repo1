package hierarchecalinheritancePrgm;

public class Daughter extends Father{

	public void leaves()
	{
		System.out.println("leaves are green");
	}
	
	public static void main(String args[]) {
		Daughter obj1=new Daughter();
		Son obj2=new Son();
		
		obj1.red();
		obj1.leaves();
		obj2.red();
		obj2.name();
	}
}
