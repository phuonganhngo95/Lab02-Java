// Bài 13
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        float gio, luong;
        double luongTong;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so gio:");
        gio = sc.nextFloat();
        System.out.println("Nhap luong");
        luong = sc.nextFloat();

        if (gio > 40) {
            luongTong = luong * 1.5;
            System.out.println("Luong tong: " + luongTong);
        } else {
            System.out.println("Luong tong: " + luong);
        }
    }
}
