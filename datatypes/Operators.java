package datatypes;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		// Arithmetic Operators--->  +  -  * /  %
		
		System.out.println("---------Arithmetic Operator------------");
		
	System.out.println("Sum of a and b is:"+(a+b));
	System.out.println("Diff of b and a is:"+(b-a));
	System.out.println("Multiplication of a and b is:"+(a*b));
	System.out.println("Div of a and b is:"+(a/b));
	System.out.println("Mod of a and b is:"+(a%b));
	
	   // Relational Operators (Comparison Operators)-->   ==  <  >  <=  >= !=
	   // Always return Boolean value
	
	System.out.println("-----------Logical Operator--------------");
	
	System.out.println(a==b);  // Return False
	System.out.println(a>b);   // Return False
	System.out.println(a<b);   // return True 
	System.out.println(a>=b);  // Return False
	System.out.println(a<=b);  // return True
	System.out.println(a!=b);  // Return True
	
	// Logical Operators  --->  && ||   !
	// Works between two boolean values
	
	boolean x=true;
	boolean y=false;
	
	System.out.println("---------Logical Operator------------");
	
	System.out.println(x && y);  // false 
	System.out.println(x || y);  // true
	System.out.println(!x);     //false
	
	// Increment / Decrement Operator
	
	System.out.println("---------Increment / Decrement Operator------------");
	
	a=10;
	a++;  // a=a+1;
	System.out.println(a);
	
	b=20;
	b--;  // b=b-1;
	System.out.println(b);
	
	
	}

}
