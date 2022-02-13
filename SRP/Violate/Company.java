package SolidPrinciplesNew.SRP.Violate;

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
        Employee emp = new Employee();
        emp.addIntern(intern,empId,empName);
        System.out.println("Enter employee id");
        String empId1 = sc.nextLine();
        System.out.println("Enter employee name");
        String empName1 = sc.nextLine();
        System.out.println("Enter experience of an employee");
        int experience = sc.nextInt();
        emp.addAssociate(associate,empId1,experience,empName1);
    }
}
