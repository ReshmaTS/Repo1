/* 2. Create a class Child that extends Parent with:

A variable name = "Child Name".

A constructor that calls the parent constructor using super() and then prints "Child constructor called".

A method showMessage() that overrides the parent method but first calls the parent method using super.showMessage(), then prints "Message from Child".

Another method displayNames() that prints both name and super.name.

*/




package samplepack;

public class Child extends Parent 
{
String name="Child name";
Child()
{
	super();
	System.out.println("Child constructor called");
	
}
	public void showMessage()
	{
		super.showMessage();
		System.out.println("message form child");
	}
	
	void displayNames()
	{
		System.out.println(super.name);
		System.out.println(name);
		
	}
}
