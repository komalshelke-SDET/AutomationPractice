package playwrite_Assignments;

public class ConstructorOverloading {
	ConstructorOverloading()
	{
		System.out.println("This is first constructor");
	}
	ConstructorOverloading(int num)
	{
		System.out.println("This is second constructor --> "+num);
	}
	ConstructorOverloading(int num1,int num2)
	{
		System.out.println("This is Third constructor --> "+(num1+num2));
	}
	ConstructorOverloading(String name)
	{
		System.out.println("This is Fourth constructor --> "+name);
	}
	ConstructorOverloading(char a)
	{
		System.out.println("This is Fifth constructor --> "+a);
	}
	public static void main(String[] args)
	{
		ConstructorOverloading obj1= new ConstructorOverloading();
		ConstructorOverloading obj2= new ConstructorOverloading(2);
		ConstructorOverloading obj3= new ConstructorOverloading(5,10);
		ConstructorOverloading obj4= new ConstructorOverloading("Komal");
		ConstructorOverloading obj5= new ConstructorOverloading('Z');
	}

}
