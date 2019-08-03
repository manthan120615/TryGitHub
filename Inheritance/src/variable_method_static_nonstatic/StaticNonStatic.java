package variable_method_static_nonstatic;

public class StaticNonStatic {
	
	//declaring variable as global
	
	String name = "manthan";
	static int age = 30;  // add static keyword o decalre variable/method as "STATIC"
			

	public static void main(String[] args) {
		
		// 1. direct calling   (//this is option 1 to call static method)
		checkName();
		System.out.println(age);
		
		// 2. calling by class name    (//this is option 2 to call static method)
		StaticNonStatic.checkName();
		System.out.println(StaticNonStatic.age);
		
		// calling non static method by creating class object
		
		StaticNonStatic obj = new StaticNonStatic();
		obj.checkAge();
		System.out.println(obj.name);
		
		/* you can also called static method by creating object but it will give you warning & it's not 
		  good practice of programming
		 */
	
		

	}
	
	public static void checkName() //static method
	{
		System.out.println("checkName method is called");
	}
	
	public void checkAge() //this is non static method
	{
		System.out.println("checkAge method is called");
	}

}
