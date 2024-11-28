// Bài 9
import java.util.Scanner;

public class KeoBaobua {
    public static void main(String[] args) {
        int p1, p2;

        System.out.println("1. Keo");
        System.out.println("2. Bua");
        System.out.println("3. Bao");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nguoi choi p1:");
        p1 = sc.nextInt();
        System.out.println("Nguoi choi p2:");
        p2 = sc.nextInt();

        if(p1 == p2) {
            System.out.println("Hoa");
        } else if ((p1 == 1 && p2 == 3) || (p1 == 2 && p2 == 1) || (p1 == 3 && p2 == 2)) {
            System.out.println("Nguoi choi 1 thang");
        } else {
            System.out.println("Nguoi choi 2 thang");
        }
    }
}
