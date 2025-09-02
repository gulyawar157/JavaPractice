import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

class InValidPriceForPremiumException extends Exception {
    public InValidPriceForPremiumException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " This is the message";
    }
}

class InvalidEmailFormatException extends RuntimeException {
    public InvalidEmailFormatException(String message) {
        super(message);
    }
}


class Customer {
    String name;
    String emailid;
    Plan plan;

    Customer(String name, String emailid, Plan plan1) {
        if (name == null ) {
            throw new IllegalArgumentException("Name cannot be null");
        }
          if (emailid == null || !emailid.contains("@")) {
        
            throw new InvalidEmailFormatException("Email format is invalid: " + emailid);
        }
        this.name = name;
        this.emailid = emailid;
        this.plan = plan1;
    }

    public void display() {
        System.out.println("Customer ID: " + emailid);
        System.out.println("Name: " + name);
        plan.displayPlan();
    }
}

class Plan {
    String plan_name;
    String network_name;
    double price;
    int speedinMbPs;

    Plan(String plan_name, String namofnetwork, double totprice, int speed) throws InValidPriceForPremiumException {
        this.plan_name = plan_name;
        this.network_name = namofnetwork;
        this.price = totprice;
        this.speedinMbPs = speed;

        if ("Premium".equals(this.plan_name) && price < 500) {
            throw new InValidPriceForPremiumException("You should pay greater than 500 for premium plans");
        }
    }

    public void displayPlan() {
        System.out.println("Plan: " + plan_name);
        System.out.println("Speed: " + speedinMbPs + " Mbps");
        System.out.println("Price: " + price);
    }
}

class ISPManager {
    private ArrayList<Customer> allcustomers = new ArrayList<>();

    public void addcustomer(Customer customer) {
        allcustomers.add(customer);
    }

    public void showallcustomers() {
        for (Customer c : allcustomers) {
            c.display();
            System.out.println("-------------------");
        }
    }
}

public class W2_Assignment {
    public static void main(String[] arg) {
        try {
            Plan basic = new Plan("Basic", "10G", 50, 50);
            Plan premium = new Plan("Premium", "12G", 1000, 80); 

            Customer c1 = new Customer("Amit ", "am@eg.com", basic);
            Customer c2 = new Customer("Tom", "plan@gs.com", premium);

            ISPManager manager = new ISPManager();
            manager.addcustomer(c1);
            manager.addcustomer(c2);
            manager.showallcustomers();

        } catch (InValidPriceForPremiumException e) {
            System.out.println("Invalid Plan: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Customer: " + e.getMessage());
        }catch(RuntimeException e){
             System.out.println(" New--- Error --- : " + e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
        } catch (SQLException e) {
            System.out.println("Caught SQLException: " + e);
        }
    }
}



