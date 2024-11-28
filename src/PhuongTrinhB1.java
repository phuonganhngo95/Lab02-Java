// Bài thực hành 3
import java.util.Scanner;

public class PhuongTrinhB1 {
    float a, b, x;

    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = sc.nextFloat();
        System.out.println("Nhap b:");
        b = sc.nextFloat();
    }

    void Pt() {
        if(a != 0) {
            x = -b/a;
            System.out.printf("Phuong trinh %.1fx + %.1f = 0 co nghiem x = %.1f", a, b, x);
        } else {
            if(b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }

    public static void main(String[] args) {
        PhuongTrinhB1 p = new PhuongTrinhB1();
        p.Nhap();
        p.Pt();
    }
}
