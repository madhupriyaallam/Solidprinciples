package SolidPrinciplesNew.LSP.Violate;

import java.util.HashMap;

public class Associate implements NewIntern{
    String empId,empName;
    int experience;
    Associate(String empName, String empId, int experience){
        this.empId = empId;
        this.empName = empName;
        this.experience = experience;
    }

    @Override
    public void addIntern(HashMap<String, String> intern) {
        //throw new AssertionError("Associate Engineer can't be added into Intern's list");
        System.out.println("Associate Engineer can't be added into Intern's list");
    }
}
