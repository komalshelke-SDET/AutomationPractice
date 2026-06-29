package playwrite_Assignments;

public class LocalGlobalVariableinSameMethod {
	double pi=3.14; // Non Static Global Variable (instance variable)
	static double area; // Static Global Variable
	public static double radius()
	{
		LocalGlobalVariableinSameMethod obj=new LocalGlobalVariableinSameMethod(); // Created object to invoke non static variable
		double radius= 7; // Local variable
		area= obj.pi*radius*radius;
		System.out.println("Area of circle --> "+area);
		return area;
	}
	public static void main(String[] args)
	{
		radius();
	}

}
