package SolidPrinciplesNew.ISP.Follow;

import java.util.HashMap;

public class Company {
    public static void main(String[] args) {
        HashMap<String, String> intern = new HashMap<>();
        HashMap<String, Integer> associate = new HashMap<>();
        Intern i = new Intern("Madhu", "madhu@123");
        i.addIntern(intern);
        Associate a1 = new Associate("sai", "sai@123", 3);
        a1.addEmployee(associate);
    }
}