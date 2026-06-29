package playwrite_Assignments;

public class CombineMethodOverloading {
	public static String display(String name)
	{
		System.out.println("This is Static method with single String argument "+name);
		return name;
	}
	public static char display(char a)
	{
		System.out.println("This is Static method with single char argument "+a);
		return a;
	}
	int display(int num1,int num2)
	{
		System.out.println("This is Non - Static method with 2 int arguments "+(num1+num2));
		return (num1+num2);
	}
	 double display(double num1,double num2)
	{
		 System.out.println("This is Non - Static method with 2 double arguments "+(num1+num2));
			return (num1+num2);
	}
	 CombineMethodOverloading()
	 {
		 System.out.println("This is 1st constructor ");
	 }
	 CombineMethodOverloading(int Number)
	 {
		 System.out.println("This is 2nd constructor "+Number);
	 }
	 CombineMethodOverloading(String lastName)
	 {
		 System.out.println("This is 3rd constructor "+lastName);
	 }
	 public static void main(String[] args)
	 {
		 //call Static methods
		 display('K');
		 display("Komal");
		 
		//call Non Static methods
		 CombineMethodOverloading obj1=new CombineMethodOverloading();
		 obj1.display(5, 5);
		 obj1.display(5.5, 10.0);
		 
		//call constructors
		 CombineMethodOverloading obj2=new CombineMethodOverloading();
		 CombineMethodOverloading obj3=new CombineMethodOverloading(5);
		 CombineMethodOverloading obj4=new CombineMethodOverloading("Komal");
	 }

}
