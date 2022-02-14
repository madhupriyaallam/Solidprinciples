package SolidPrinciplesNew.DIP.Follow;

import java.util.HashMap;

public class Company {
    public static void main(String[] args) {
        HashMap<String, String> interns = new HashMap<>();
        HashMap<String, Integer> associate = new HashMap<>();
        NewIntern i = Intern.getUser();
        Associate a = new Associate(3,i);
        i.addIntern(interns,"madhu@123","madhu");
        a.addEmployee(associate,"madhu@123","madhu");
        a.removeIntern(interns,"madhu@123","madhu");
        Associate a1 = new Associate(4);
        a1.addEmployee(associate,"sai@123","sai");
    }
}
