package SolidPrinciplesNew.DIP.Violate;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> associate = new HashMap<>();
        HashMap<String,String> intern = new HashMap<>();
        Intern i = new Intern("madhu","madhu@123");
        i.addIntern(intern);
        Associate a = new Associate(3,i);
        a.removeIntern(intern);
        a.addEmployee(associate);
    }
}
