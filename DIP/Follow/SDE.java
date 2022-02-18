package SolidPrinciplesNew.DIP.Follow;

import java.util.HashMap;

public class SDE implements NewEmployee{
    String empId,empName;
    int experience;
    public SDE(String empId, String empName, int experience){
        this.empId = empId;
        this.empName = empName;
        this.experience = experience;

    }
    public void addEmployee(HashMap<String, Integer> employees){
        employees.put(this.empName,this.experience);
        System.out.println("New SDE "+empName+" joined with an experience of "+experience);
    }
}
