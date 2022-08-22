package method;

public class Method1 {

	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display()
	{
		    System.out.println(eid);
		    System.out.println(sal);
		    System.out.println(deptno);
		    System.out.println(job);
	}
	
	public static void main(String[] args) 
	{
		     Method1 emp1=new Method1();  // Creating Object (Here Method1 is Our Class Name & emp1 is variable name
		     emp1.eid=101;
		     emp1.ename="David";
		     emp1.sal=2500.00;
		     emp1.deptno=10;
		     emp1.job="Manager";
		     emp1.display();
		     
		     System.out.println("--------");
		     
		     Method1 emp2=new Method1();  // Creating Object (Here Method1 is Our Class Name & emp2 is Another variable name
		     emp2.eid=102;
		     emp2.ename="Andey";
		     emp2.sal=30000.00;
		     emp2.deptno=11;
		     emp2.job="Tester";
		     emp2.display();
		     
		     
		
	}

}
