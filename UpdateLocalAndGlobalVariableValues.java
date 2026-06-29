package playwrite_Assignments;

public class UpdateLocalAndGlobalVariableValues {
	
	double d=20.24;
	static long l=202020202020l;
		
	public static float updateLocalVariable() // Updating local variable
	{
		float num= 3.24f;
		System.out.println("The value of num variable before updates is = "+num);
		num=20;
		System.out.println("The value of num variable after update is = "+num);
		return num;
	}
	public static double updateGlobalVariable() // Updating global variable
	{
		//calling non static variable by creating object of class
		UpdateLocalAndGlobalVariableValues update=new UpdateLocalAndGlobalVariableValues();
		System.out.println("The value of non static variable d before updates is = "+update.d);
		update.d=10;
		System.out.println("The value of non static variable d after update is = "+update.d);
		
		//calling static variable directly by its name
		System.out.println("The value of static variable l before updates is = "+l);
		l=10;
		System.out.println("The value of static variable l after update is = "+l);
		return update.d;
	}
	
	public static void main(String[] args)
	{
		updateLocalVariable();
		updateGlobalVariable();
		
	}

}
