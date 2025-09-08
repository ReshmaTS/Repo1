package multilevelInheritanve2;

public class Student extends Course{
	String Stuname ="reshma";
	public void issueID()
	{
		System.out.println(collagename+ " " + CourseName+ " " +Stuname);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.issueID();
	}

}
