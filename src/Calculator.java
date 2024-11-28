// Bài 11
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float x, y, kq;
        char pheptinh;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x:");
        x = sc.nextFloat();
        System.out.println("Nhap y:");
        y = sc.nextFloat();
        System.out.println("Nhap phep tinh:");
        pheptinh = sc.next().charAt(0);

        switch (pheptinh) {
            case '+':
                kq = x + y;
                System.out.println("x + y = " + kq);
                break;
            case '-':
                kq = x - y;
                System.out.println("x + y = " + kq);
                break;
            case '*':
                kq = x * y;
                System.out.println("x * y = " + kq);
                break;
            case '/':
                if (y == 0) {
                    System.out.println("Khong thuc hien phep chia");
                } else {
                    kq = x / y;
                    System.out.println("x / y = " + kq);
                    break;
                }
        }
    }
}
