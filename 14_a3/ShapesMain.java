import java.util.Scanner;

class Shapes {

    double result;


    Shapes(double radius) {
        result = 3.14 * radius * radius;
    }

    Shapes(double length, double breadth) {
        result = length * breadth;
    }

    Shapes(double base, double height, int x) {
        result = 0.5 * base * height;
    }

    Shapes(int side) {
        result = side * side;
    }



    double area(double radius) {
        return 3.14 * radius * radius;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double base, double height, int x) {
        return 0.5 * base * height;
    }

    double area(int side) {
        return side * side;
    }
}

public class ShapesMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shapes s;

        System.out.println("Choose Shape:");
        System.out.println("1. Circle  2. Rectangle  3. Triangle  4. Square");

        int choice = sc.nextInt();

switch (choice) {

case 1:
System.out.print("Enter radius: ");
double r = sc.nextDouble();
s = new Shapes(r);

System.out.println("Constructor Result: " + s.result);
System.out.println("Method Result: " + s.area(r));
break;

case 2:
System.out.print("Enter length & breadth: ");
double l = sc.nextDouble();
double b = sc.nextDouble();
s = new Shapes(l, b);

System.out.println("Constructor Result: " + s.result);
System.out.println("Method Result: " + s.area(l, b));
break;

case 3:
System.out.print("Enter base & height: ");
double base = sc.nextDouble();
double h = sc.nextDouble();
s = new Shapes(base, h, 1);

System.out.println("Constructor Result: " + s.result);
System.out.println("Method Result: " + s.area(base, h, 1));
break;

case 4:
System.out.print("Enter side: ");
int side = sc.nextInt();
s = new Shapes(side);

System.out.println("Constructor Result: " + s.result);
System.out.println("Method Result: " + s.area(side));
break;

default:
System.out.println("Invalid choice");
}

sc.close();
 }
}