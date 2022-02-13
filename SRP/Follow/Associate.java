package SolidPrinciplesNew.SRP.Follow;

import java.util.HashMap;

public class Associate {
    String empId,empName;
    int experience;
    void addAssociate(HashMap<String, Integer> associate, String empId, Integer experience, String empName){
        this.empName = empName;
        this.empId = empId;
        this.experience = experience;
        associate.put(empId,experience);
        System.out.println("Welcome "+empName+", Associate engineer with an experience of "+experience+" years");
    }
}
