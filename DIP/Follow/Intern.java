package SolidPrinciplesNew.DIP.Follow;

import java.util.HashMap;

public class Intern implements NewIntern{
     public static Intern intern = new Intern();

    public static Intern getUser(){
        return intern;
    }

    @Override
    public void addIntern(HashMap<String, String> intern, String empId, String empName) {
        intern.put(empId,empName);
        System.out.println("Welcome "+empName+", Happy Learning!!!");
    }
}
