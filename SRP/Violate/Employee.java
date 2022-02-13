package SolidPrinciplesNew.SRP.Violate;

import java.util.HashMap;

public class Employee {
    String empId,empName;
    int experience;
    void addIntern(HashMap<String,String> intern,String empId,String empName){
        this.empId = empId;
        this.empName = empName;
        intern.put(empId,empName);
        System.out.println("Welcome "+empName+", Happy Learning!!!");
    }
    void addAssociate(HashMap<String, Integer> associate, String empId, Integer experience, String empName){
        this.empName = empName;
        this.empId = empId;
        this.experience = experience;
        associate.put(empId,experience);
        System.out.println("Welcome "+empName+", Associate engineer with an experience of "+experience+" years");
    }
}