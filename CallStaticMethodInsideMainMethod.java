package playwrite_Assignments;

public class CallStaticMethodInsideMainMethod {

	//Static Method
	public static void staticMethod() //Non-parameterized method
	{ 
		System.out.println("This is Static Method as method declaration contains static keyword and its return type is void");
	}
	public static int intMethod()  //Non-parameterized method
	{
		System.out.println("This is Static method with Return type integer");
		return 0;
		
	}
	public static int intMethod(int i, int j) //Parameterized method
	{
		System.out.println("This is parametrized method ");
		return j;
		
	}
	public char NonstaticMethod() //Non-parameterized method
	{ 
		System.out.println("This is NonStatic Method as method declaration does not contain static keyword and its return type is char");
		return 'A';
	}
	
	static boolean booleanMethod()  // Non-parameterized method with default access specifier 
	{
		System.out.println("This is Static method with Return type boolean and access specifier is default");
		return true;
		
	}
	double doubleMethod()
	{
		System.out.println("This is non parameterized method where return type is double and Access specifier is Default, method is non static.");
		return 0;
		
	}
	public static void main(String[] args)
	{
		//Calling static methods
		staticMethod();
		intMethod();
		intMethod(1, 10);
		booleanMethod();
		//Calling Non Static methods
		CallStaticMethodInsideMainMethod obj=new CallStaticMethodInsideMainMethod(); // Created object of class 
		obj.doubleMethod();
		obj.NonstaticMethod();
		
	}
	
}
