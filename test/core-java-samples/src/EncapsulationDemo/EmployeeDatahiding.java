package EncapsulationDemo;

public class EmployeeDatahiding {
	
	private int id;
    private String empName;
    

    //Getter and Setter methods
    public int getEmpid(){
        return id;
    }

    public String getEmpName(){
        return empName;
    }

   
    

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        id = newValue;
    }
}


