import java.io.*;
import java.util.*;

class Banking {

    int id;
    String name;
    double amount;

    Banking(int id, String name, double amount) throws Exception {

        if (id < 1 || id > 20)
            throw new Exception("cid must be between 1 and 20");

        if (amount < 1000)
            throw new Exception("minimum balance should be 1000");

        if (amount < 0)
            throw new Exception("amount must be positive");

        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    void deposit(double amt) throws Exception {
        if (amt <= 0)
            throw new Exception("deposit must be positive");

        amount += amt;
    }

    void withdraw(double amt) throws Exception {
        if (amt > amount)
            throw new Exception("insufficient balance");

        amount -= amt;
    }

    void display() {
        System.out.println(id + " " + name + " " + amount);
    }
}

public class BankingMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("enter cid: ");
            int id = sc.nextInt();

            System.out.print("enter name: ");
            String name = sc.next();

            System.out.print("enter amount: ");
            double amount = sc.nextDouble();

            Banking b = new Banking(id, name, amount);

            int choice;

            do {
                System.out.println("\n1.deposit 2.withdraw 3.display 4.save 5.exit");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("enter deposit amount: ");
                        double d = sc.nextDouble();
                        b.deposit(d);
                        break;

                    case 2:
                        System.out.print("enter withdraw amount: ");
                        double w = sc.nextDouble();
                        b.withdraw(w);
                        break;

                    case 3:
                        b.display();
                        break;

                    case 4:
                        FileWriter fw = new FileWriter("customer.txt", true);
                        fw.write(b.id + " " + b.name + " " + b.amount + "\n");
                        fw.close();
                        System.out.println("saved to file");
                        break;

                    case 5:
                        System.out.println("exit");
                        break;

                    default:
                        System.out.println("invalid selection");
                }

            } while (choice != 5);

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        sc.close();
    }
}