
public class PartTimeEmployee extends Employee{

	private int hoursWorked;
	private double hourlyRate;
	
	public PartTimeEmployee(String name, int id,double hourlyRate, int hoursWorked) {
		super(name, id);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
		
	}

	@Override
	public double calculateSalary() {
		
		return hoursWorked*hourlyRate;
	}

}
