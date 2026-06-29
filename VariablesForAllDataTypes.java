package playwrite_Assignments;

public class VariablesForAllDataTypes {
public static void main(String[] args)
{
	//Primitive Data Types ---> Predefined data types , Stores actual Value directly, cannot be null.
	int i=100;
	char ch= 'R';
	boolean b= true; 
	long l= 1999000001l;
	double d=100.99; 
	float f= 20.5f;
	short s= 22895;
	
//	Non Primitive Data types --> User defined Data Types, Store Address of object, can be null.
	String name= "Komal"; //String is a Class, name is object 
	
	//Print All data Types
	System.out.println("Integer : "+i);
	System.out.println("Character : "+ch);
	System.out.println("Boolean : "+b);
	System.out.println("Long : "+l);
	System.out.println("Double : "+d);
	System.out.println("Float : "+f);
	System.out.println("Short : "+s);
	System.out.println("String is a Class and non Primitive Data Type : "+ name);
	
}
}
