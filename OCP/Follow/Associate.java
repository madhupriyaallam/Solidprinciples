package SolidPrinciplesNew.OCP.Follow;

import java.util.HashMap;

public class Associate implements NewEmployee{
    String empId,empName;
    int experience;
    Associate(String empName, String empId, int experience){
        this.empId = empId;
        this.empName = empName;
        this.experience = experience;
    }
    @Override
    public void addEmployee(HashMap<String, Integer> associate) {
        associate.put(this.empId,this.experience);
        System.out.println("Welcome "+this.empName+", Associate engineer with an experience of "+this.experience+" years");
    }
}
