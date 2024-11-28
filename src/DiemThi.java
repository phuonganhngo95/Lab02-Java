// Bài 12
import java.util.Scanner;

public class DiemThi {
    public static void main(String[] args) {
        float toan, li, hoa;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem Toan:");
        toan = sc.nextFloat();
        System.out.println("Nhap diem Li:");
        li = sc.nextFloat();
        System.out.println("Nhap diem Hoa:");
        hoa = sc.nextFloat();
        float tong = toan + li + hoa;

        if (tong>=15) {
            if (!(toan<4) && !(li<4) && !(hoa<4)) {
                System.out.println("Dau");
            }
            if (toan>5 && li>5 && hoa>5) {
                System.out.println("Hoc deu cac mon");
            } else {
                System.out.println("Hoc chua deu cac mon");
            }
        } else {
            System.out.println("Thi hong");
        }
    }
}
