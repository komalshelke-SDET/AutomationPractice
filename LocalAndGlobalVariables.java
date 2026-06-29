package playwrite_Assignments;

public class LocalAndGlobalVariables {
	static int d=20; // Global Variable
	double radius; // Instance Variable ----> this is non static variable and to use this in method we need to create object of class
	public static int mul()
	{
		int num1= 8; // local variable
		int num2= 12; // local variable
		int multiplication= num1*num2; // local variable
		System.out.println("multiplication of two integer numbers is - "+multiplication);
		return multiplication;
	}
	
	public static double radius()
	{
		LocalAndGlobalVariables var=new LocalAndGlobalVariables(); // created obj of class to use non static variable in static method
		var.radius=d/2;
		return var.radius;
	}
	public static void main(String[] args)
	{
		mul();
		System.out.println("Given Diameter of the circle is = "+d);
		radius();
		System.out.println("Radius of the circle is = "+radius());
		
	}

}
