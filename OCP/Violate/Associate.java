package SolidPrinciplesNew.OCP.Violate;

public class Associate extends Company{
    String empId,empName;
    int experience;
    Associate(String empName, String empId, int experience){
        this.empId = empId;
        this.empName = empName;
        this.experience = experience;
    }
}
