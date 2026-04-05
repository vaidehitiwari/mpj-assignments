
import java.util.Scanner;
class hillstations{
    void food(){
        System.out.println("Famous foods");
    }
     void hallmark() {
        System.out.println("Famous for scenic beauty");
    }
}

class lonavala extends hillstations{
    @Override
    void food(){
        System.out.println("lonavala is famous for chikkis");
    }
    @Override
    void hallmark(){
        System.out.println("lonavala is famous for scenic spots(tiger point)");
    }
}

class darjeeling extends hillstations {

    @Override
    void food() {
        System.out.println("Darjeeling has good tea and momos  ");
    }
    @Override
    void hallmark() {
        System.out.println("Darjeeling has many tea plantations");
    }
}


class coorg extends hillstations {

    @Override
    void food() {
        System.out.println("coorg is famous for coffee");
    }

    @Override
    void hallmark() {
        System.out.println("coorg is famous for coffee plantations");
    }
}

public class hillstationMain{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        hillstations hs;

        System.out.println("Choose a Hill Station:");
        System.out.println("1. lonaval");
        System.out.println("2. darjeeling");
        System.out.println("3. coorg");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                hs = new lonavala();
                break;
            case 2:
                hs = new darjeeling();
                break;
            case 3:
                hs= new coorg();
                break;
            default:
                System.out.println("Invalid choice");
                return;
                
        }

        hs.food();
        hs.hallmark();
        
    }
}