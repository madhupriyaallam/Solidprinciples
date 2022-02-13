package SolidPrinciplesNew.LSP.Follow;

import java.util.HashMap;

public class Intern implements NewIntern{
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
}
