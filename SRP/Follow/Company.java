package SolidPrinciplesNew.SRP.Follow;

import SolidPrinciplesNew.SRP.Violate.Employee;

import java.util.HashMap;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        HashMap<String,String> intern = new HashMap<>();
        HashMap<String,Integer> associate = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Intern i1 = new Intern();
        System.out.println("Enter employee id");
        String empId = sc.nextLine();
        System.out.println("Enter employee name");
        String empName = sc.nextLine();
        i1.addIntern(intern,empId,empName);
        Associate a1 = new Associate();
        System.out.println("Enter employee id");
        String empId1 = sc.nextLine();
        System.out.println("Enter employee name");
        String empName1 = sc.nextLine();
        System.out.println("Enter experience of an employee");
        int experience = sc.nextInt();
        a1.addAssociate(associate,empId1,experience,empName1);
    }
}
