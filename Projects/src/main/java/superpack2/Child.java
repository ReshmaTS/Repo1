package superpack2;

public class Child extends Parent{

	void display()
	{
		System.out.println("Child class method");
	}
	
	
	void work()
	{
		super.display();
		System.out.println("Used to invoke immediate parent class method");
	}
}
