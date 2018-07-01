package Arrays;

public class printArray {
	
	public static void main(String[] args) {
		
		Employee[] e = new Employee[3];
		e[0]= new Employee("Emp1", "A1");
		e[1]= new Employee("Emp2", "A2");
		e[2]= new Employee("Emp3", "A3");
		printEmployeeDetails(e);
		
	}

	
	public static void printEmployeeDetails(Employee[] emps) {
		
		for(Employee em : emps) {
			System.out.println("Employee Name: " + em.getEmpName() + "," + "Employee ID: " + em.getEmpID());
		}
	}
}
