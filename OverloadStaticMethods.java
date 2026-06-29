package playwrite_Assignments;

public class OverloadStaticMethods {
	static int sum() // non-parameterized method
	{
		int num1= 10;
		int num2= 5;
		int sum=num1+num2;
		System.out.println("Sum of two number is --> "+sum);
		return sum;
	}
	static int sum(int number1, int number2) // parameterized with data type integer
	{
		System.out.println("Sum of two integer number is --> "+(number1+number2));
		return 0;
	}
	public static int sum(double num1, double num2) // parameterized with data type double
	{
		System.out.println("Summation of two double number is --> "+(num1+num2));
		return 0;
	}
	public float sum(float num1, float num2) // parameterized with data type float
	{
		System.out.println("Summation of two float number is --> "+(num1+num2));
		return 0;
		
	}
	public static String sum(String a)
	{
		System.out.println(a);
		return a;
		
	}
	public static void main(String[] args)
	{
		sum();
		sum(10,20);
		sum(20.20,10.20);
		sum(2.2,3.2);
		sum("This is called method overloading of Static methods. ");
	}

}
