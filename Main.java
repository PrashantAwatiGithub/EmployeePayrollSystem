
public class Main {

	public static void main(String[] args) {
		
		PayrollSystem payrollSystem =new PayrollSystem();
	    FullTimeEmployee emp1 = new FullTimeEmployee("ram",1, 10000.0);
	    PartTimeEmployee emp2 = new PartTimeEmployee ("sham",2,40,100);
	    
	    payrollSystem.addEmployee(emp1);
	    payrollSystem.addEmployee(emp2);
	    System.out.println( "Initial Employee System:");
	    
	    payrollSystem.displyEmployees();

	    System.out.println("Remove Employees");
	    payrollSystem.removeEmployee(2);
	    
	    System.out.println("remaining employees");
	    payrollSystem.displyEmployees();
	}

}
