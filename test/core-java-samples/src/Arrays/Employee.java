package Arrays;

public class Employee {
	
	private String EmpName;
	private String EmpID;
	
	public Employee(String Empname, String EmpID) {
		this.EmpName=Empname;
		this.EmpID= EmpID;
	}
	
	public String getEmpName() {
		return EmpName;
	}
	
	public String getEmpID() {
		return EmpID;
	}

}
