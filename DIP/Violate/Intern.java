package SolidPrinciplesNew.DIP.Violate;

import java.util.HashMap;

public class Intern {
    String empId,empName;
    Intern(String empName,String empId){
        this.empId = empId;
        this.empName = empName;
    }
    public void addIntern(HashMap<String,String> intern) {
        intern.put(this.empId,this.empName);
        System.out.println("Welcome "+this.empName+", Happy Learning!!!");
    }
}
