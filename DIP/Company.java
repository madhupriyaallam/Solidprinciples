package SolidPrinciplesNew.DIP;

import SolidPrinciplesNew.DIP.Follow.Associate;
import SolidPrinciplesNew.DIP.Follow.NewIntern;

import java.util.HashMap;

public class Company {
    public static void main(String[] args) {
        HashMap<String, String> interns = new HashMap<>();
        HashMap<String, Integer> associate = new HashMap<>();
        NewIntern i = Intern.getUser(); // I'm getting some problem ryt here
        Associate a = new Associate(3,i);
        i.addIntern(interns,"madhu@123","madhu");
        a.addEmployee(associate,"madhu@23","madhu");
        a.removeIntern(interns,"madhu@123","madhu");
    }
}
