package day12;

// Parent Class
class EmployeeDetails
{
    int empId;
    String name;

    void showDetails()
    {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
    }
}

// Child Class 1
class Manager extends EmployeeDetails
{
    void manageTeam()
    {
        System.out.println("Role : Manager");
        System.out.println("Manager handles the team");
    }
}

// Child Class 2
class Developer extends EmployeeDetails
{
    void writeCode()
    {
        System.out.println("Role : Developer");
        System.out.println("Developer writes code");
    }
}

// Child Class 3
class Tester extends EmployeeDetails
{
    void testSoftware()
    {
        System.out.println("Role : Tester");
        System.out.println("Tester tests the software");
    }
}

// Child Class 4
class Intern extends EmployeeDetails
{
    void learnWork()
    {
        System.out.println("Role : Intern");
        System.out.println("Intern is learning the work");
    }
}

// Main Class
public class employeeManagementSystem
{
    public static void main(String[] args)
    {
        // Manager Object
        Manager m = new Manager();
        m.empId = 101;
        m.name = "Tejesh";

        m.showDetails();
        m.manageTeam();

        System.out.println();

        // Developer Object
        Developer d = new Developer();
        d.empId = 102;
        d.name = "Teja";

        d.showDetails();
        d.writeCode();

        System.out.println();

        // Tester Object
        Tester t = new Tester();
        t.empId = 103;
        t.name = "Devi Priya";

        t.showDetails();
        t.testSoftware();

        System.out.println();

        // Intern Object
        Intern i = new Intern();
        i.empId = 104;
        i.name = "Kusuma";

        i.showDetails();
        i.learnWork();
    }
}