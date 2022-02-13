package SolidPrinciplesNew.DIP.Follow;

import java.util.HashMap;

public class Associate {
    NewIntern i;
    int experience;
    public Associate(int experience, NewIntern i){
        this.experience = experience;
        this.i = i;
    }
    public void addEmployee(HashMap<String, Integer> associate, String empId, String empName) {
        associate.put(empId,this.experience);
        System.out.println("Welcome "+empName+", Associate engineer with an experience of "+this.experience+" months");
    }
    public void removeIntern(HashMap<String,String> intern, String empId, String empName){
        intern.remove(empId);
        System.out.println("Intern "+empName+" with id "+empId+" is promoted as Associate Engineer");
    }
}
