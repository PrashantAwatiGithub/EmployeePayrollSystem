import java.util.ArrayList;

public class PayrollSystem {

	private ArrayList<Employee>employeeList;
	
	
	 public PayrollSystem() {
		 employeeList = new ArrayList<>();
		 
	 }
	 public void addEmployee(Employee employee) {
		 employeeList.add(employee);
		 
	 }
	 public void removeEmployee(int id) {
		 Employee employeeTORemove = null;
		 
		 for(Employee employee:employeeList) {
			 if(employee.getId()==id) {
				 employeeList.remove(employeeTORemove);
				 break;
			 }
		 }
		 
		 if(employeeTORemove!= null) {
			 employeeList.remove(employeeTORemove);
			 
		 }
	 }
	 
	 public void displyEmployees() {
		 for(Employee employee:employeeList) {
			 System.out.println(employee);
		 }
	 }
}
