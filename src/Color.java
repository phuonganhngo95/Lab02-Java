// Bài 10
import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        char kt;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ki tu:");
        kt = sc.next().charAt(0);

        if(kt=='R' || kt=='r') {
            System.out.println("RED");
        } else if (kt=='G' || kt=='g') {
            System.out.println("GREEN");
        } else if (kt=='B' || kt=='b') {
            System.out.println("BLUE");
        } else {
            System.out.println("BLACK");
        }
    }
}
