package SolidPrinciplesNew.DIP.Follow;

import java.util.HashMap;

public class Company {
    public static void main(String[] args) {
        HashMap<String, Integer> employees = new HashMap<>();
        NewEmployee n1 = new Associate("madhu@123","madhu",2);
        NewEmployee n2 = new SDE("sai@123","sai",4);
        Employee emp1 = new Employee(n1);
        emp1.addNewEmployee(employees);
        Employee emp2 = new Employee(n2);
        emp2.addNewEmployee(employees);
    }
}
