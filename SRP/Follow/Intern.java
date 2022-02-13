package SolidPrinciplesNew.SRP.Follow;

import java.util.HashMap;

public class Intern {
    String empId,empName;
    void addIntern(HashMap<String,String> intern, String empId, String empName){
        this.empId = empId;
        this.empName = empName;
        intern.put(empId,empName);
        System.out.println("Welcome "+empName+", Happy Learning!!!");
    }
}
