package SolidPrinciplesNew.DIP.Violate;

import java.util.HashMap;

public class Associate {
    Intern i;
    int experience;
    Associate(int experience, Intern i){
        this.experience = experience;
        this.i = i;
    }
    public void addEmployee(HashMap<String, Integer> associate) {
        associate.put(i.empId,this.experience);
        System.out.println("Welcome "+i.empName+", Associate engineer with an experience of "+this.experience+" months");
    }
    public void removeIntern(HashMap<String,String> intern){
        intern.remove(i.empId);
        System.out.println("Intern "+i.empName+" with id "+i.empId+" is promoted as Associate Engineer");
    }
}
