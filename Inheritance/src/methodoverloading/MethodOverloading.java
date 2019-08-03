package methodoverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(10);
		mo.sum(20, 30);
	}
	
	public void sum()
	{
		System.out.println("sum with 0 params");
	}
	
	public void sum(int i)
	{
		System.out.println("sum with 1 param");
		System.out.println(i);
	}
	

	
	public void sum(int j, int k)
	{
		System.out.println("sum with 2 params");
		System.out.println(j+ k);
	}

}
