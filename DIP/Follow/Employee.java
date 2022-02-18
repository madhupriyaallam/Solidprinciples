package SolidPrinciplesNew.DIP.Follow;

import java.util.HashMap;

public class Employee {
    NewEmployee emp;
    Employee(NewEmployee emp){
        this.emp = emp;
    }
    void addNewEmployee(HashMap<String, Integer> employees){
        this.emp.addEmployee(employees);
    }
}
