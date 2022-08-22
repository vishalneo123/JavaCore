// Constructor Parameters
//Constructors can also take parameters, which is used to initialize attributes.


package constructor;

	
	public class ConstructParameter1 {
		  int x;

		  public ConstructParameter1(int y) {
		    x = y;
		  }

		  public static void main(String[] args) {
			  ConstructParameter1 myObj = new ConstructParameter1(5);
		    System.out.println(myObj.x);

	
	}

}

