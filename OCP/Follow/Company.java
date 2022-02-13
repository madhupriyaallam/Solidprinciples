package SolidPrinciplesNew.OCP.Follow;

import java.util.HashMap;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        HashMap<String,String> intern = new HashMap<>();
        HashMap<String,Integer> associate = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id");
        String empId = sc.nextLine();
        System.out.println("Enter employee name");
        String empName = sc.nextLine();
        Intern i = new Intern(empName,empId);
        i.addIntern(intern);
        System.out.println("Enter employee id");
        String empId1 = sc.nextLine();
        System.out.println("Enter employee name");
        String empName1 = sc.nextLine();
        System.out.println("Enter experience of an employee");
        int experience = sc.nextInt();
        Associate a1 = new Associate(empName1,empId1,experience);
        a1.addEmployee(associate);
    }
}
