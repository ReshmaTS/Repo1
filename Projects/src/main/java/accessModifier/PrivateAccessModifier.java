package accessModifier;

public class PrivateAccessModifier {
	
	private String name="reshma";
	
	private void msg()
	{
		System.out.println("Using private access modifier");
		System.out.println("Access only within the same class");
		System.out.println("Main Method should be in the same class");
	}
			

	public static void main(String[] args) {
		PrivateAccessModifier obj=new PrivateAccessModifier();
		obj.msg();
		System.out.println(obj.name);
		
		
	}

}
