package SolidPrinciplesNew.OCP.Violate;

import java.util.HashMap;

public class Company {
    void addIntern(HashMap<String,String> intern, Intern i){
        intern.put(i.empId,i.empName);
        System.out.println("Welcome "+i.empName+", Happy Learning!!!");
    }
    void addAssociate(HashMap<String, Integer> associate, Associate a){
        associate.put(a.empId,a.experience);
        System.out.println("Welcome "+a.empName+", Associate engineer with an experience of "+a.experience+" years");
    }
}
