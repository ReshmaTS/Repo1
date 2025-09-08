package defaultpack;

public class DefaultClass {
 int num=10;
	void print()
	{
		System.out.println("Sample prgm for default access modifier");
	}
	
	public static void main(String[] args) {
		DefaultClass obj=new DefaultClass();
		obj.print();
		
	}

}
