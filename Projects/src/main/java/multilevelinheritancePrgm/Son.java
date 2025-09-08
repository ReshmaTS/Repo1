package multilevelinheritancePrgm;

public class Son extends Father {
	public void eyes()
	{
		System.out.println("round eyes");
	}

	public static void main(String[] args) {
		
Son obj=new Son();
obj.behaviour();
obj.haircolour();
obj.eyes();
	}

}
