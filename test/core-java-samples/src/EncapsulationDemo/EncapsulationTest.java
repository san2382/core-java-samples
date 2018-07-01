package EncapsulationDemo;

public class EncapsulationTest {

	public static void main(String args[]){
        EmployeeDatahiding obj = new EmployeeDatahiding();
        obj.setEmpName("Marc");
        obj.setEmpSSN(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpid());
	}
}


/*All the data fields are private which cannot be accessed directly. 
These fields can be accessed via public methods only. 
Fields EmpName, Empid are made hidden data fields using encapsulation technique of OOPs.
Advantages of encapsulation
It improves maintainability and flexibility and re-usability: 
The fields can be made read-only 
Encapsulation is also known as “data Hiding“.*/