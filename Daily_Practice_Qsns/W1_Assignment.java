import java.util.*;

enum EmployeeCategory {
    TRAINEE, JUNIOR_ENGG, ENGG, SENIOR_ENGG, TECHNICAL_LEAD
}

class UserInfo {
    private String username;
    private String password;
    private String emailid;

    UserInfo(String username, String password, String emailid) {
        this.username = username;
        this.password = password;
        this.emailid = emailid;
    }

    @Override
    public String toString() {
        return "Username = " + username + ", email = " + emailid;
    }
}

class Employee {
    private String employeename;
    private int employeeid;
    private String department;
    private EmployeeCategory jobtitle;
    private int phoneno;

    Employee(String employeename, int employeeid, String department, EmployeeCategory jobtitle, int phoneno) {
        this.employeename = employeename;
        this.employeeid = employeeid;
        this.department = department;
        this.jobtitle = jobtitle;
        this.phoneno = phoneno;
    }

    @Override
    public String toString() {
        return "Employeeid = " + employeeid + ", Name = " + employeename + ", Department = " + department + ", Role = "
                + jobtitle;
    }
}

class AvailablePlan {
    private String nameofplan;
    private int price;
    private int planvalidity;
    private String plandesc;

    AvailablePlan(String nameofplan, int price, int planvalidity, String plandesc) {
        this.nameofplan = nameofplan;
        this.price = price;
        this.planvalidity = planvalidity;
        this.plandesc = plandesc;
    }

    @Override
    public String toString() {
        return "Plan Name = " + nameofplan + ", Price= " + price + ", Validity= " + planvalidity + " days,  "
                + "Plan Description : " + plandesc;
    }
}

public class W1_Assignment {
    public static void main(String[] args) {

        List<UserInfo> users = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        List<AvailablePlan> plans = new ArrayList<>();

        users.add(new UserInfo("Tom", "securepass123", "rtom@example.com"));
        users.add(new UserInfo("Alice", "alicepass", "alice@example.com"));
        users.add(new UserInfo("Paul", "paulpass", "paul@example.com"));

        employees.add(new Employee("Rocky", 131, "IT", EmployeeCategory.TRAINEE, 93210));
        employees.add(new Employee("Rahul", 136, "HR", EmployeeCategory.SENIOR_ENGG, 98765));
        employees.add(new Employee("Donald", 139, "IT", EmployeeCategory.ENGG, 98765));

        plans.add(new AvailablePlan("Basic", 509, 30, "Basic plan with 1GB/day"));
        plans.add(new AvailablePlan("Premium", 709, 90, "Premium plan with 2GB/day "));
        plans.add(new AvailablePlan("VIP", 1099, 120, "Premium plan with unlimited data"));

        System.out.println("Users are: ");
        for (UserInfo i : users)
            System.out.println(i);

        System.out.println("Employees are: ");
        for (Employee j : employees)
            System.out.println(j);

        System.out.println("Plans are : ");
        for (AvailablePlan k : plans)
        System.out.println(k);
    }
}
