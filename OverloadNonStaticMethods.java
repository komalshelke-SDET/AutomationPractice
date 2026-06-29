package playwrite_Assignments;

public class OverloadNonStaticMethods {
	public String display(String name)
	{
		System.out.println(name);
		return name;
	}
	int display()
	{
		int number=10000;
		System.out.println("This is integer value --> "+number);
		return number;
	
	}
	double display(double val1, int val2)
	{
		System.out.println("sum of two numbers is --> "+(val1+val2));
		return val1+val2;
	}
	char display(char a, int b)
	{
		System.out.println("values for char return type method is  --> "+a +" and "+b);
		return a;
	}
	public static void main(String[] args)
	{
		OverloadNonStaticMethods onsm=new OverloadNonStaticMethods();
		onsm.display();
		onsm.display("This is non Static method overloading");
		onsm.display(10.10, 10);
		onsm.display('A', 5);
	}

}
