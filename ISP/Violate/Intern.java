package SolidPrinciplesNew.ISP.Violate;

import java.util.HashMap;

public class Intern implements NewEmployee{
    String empId,empName;
    Intern(String empName,String empId){
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public void addIntern(HashMap<String,String> intern) {
        intern.put(this.empId,this.empName);
        System.out.println("Welcome "+this.empName+", Happy Learning!!!");
    }

    @Override
    public void addEmployee(HashMap<String, Integer> associate) {
        throw new AssertionError("Associate Engineer can't be added into Intern's list");
    }
}
