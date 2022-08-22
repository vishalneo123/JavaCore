package method;

public class MethodParameterone {

	int x=10;
	int y=20;
	
	void sum()            // Case1- Not taking parameters and not returned any value
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		MethodParameterone cal=new MethodParameterone();  // MethodParameterone is main class name and we definde cal new variable 
		cal.sum();  // 
		

	}

}
