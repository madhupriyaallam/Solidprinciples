package SolidPrinciplesNew.ISP.Violate;

import java.util.HashMap;

public class Company {
    public static void main(String[] args) {
        HashMap<String, String> intern = new HashMap<>();
        HashMap<String, Integer> associate = new HashMap<>();
        Intern i = new Intern("Madhu", "madhu@123");
        i.addIntern(intern);
        i.addEmployee(associate);
//        Associate a1 = new Associate("sai", "sai@123", 3);
//        a1.addIntern(intern);
//        a1.addEmployee(associate);
    }
}
