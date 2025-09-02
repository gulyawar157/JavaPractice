import java.util.Scanner;

class Basecat {
    public void discount(int total) {
        System.out.println(total - 0.1 * total);
    }
}

class Bcat extends Basecat {
    public void discount(int total) {
        System.out.println(total - 0.2 * total);
    }
}

class Acat extends Basecat {
    public void discount(int total) {
        System.out.println(total - 0.25 * total);
    }
}

class Alphacat extends Basecat {
    public void discount(int total) {
        System.out.println(total - 0.35 * total);
    }
}

public class Day2_q1 {
    public static void main(String[] args) {
        System.out.println("Enter your % marks in 12th so that you can avail discount according to it: ");
        int total = 1000000;
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        sc.close();

        Basecat student; 

        if (marks >= 95) {
            student = new Alphacat();
        } else if (marks >=90) {
            student = new Acat();
        } else if (marks >=80) {
            student = new Bcat();
        } else {
            student = new Basecat();
        }

        student.discount(total); 
    }
}
