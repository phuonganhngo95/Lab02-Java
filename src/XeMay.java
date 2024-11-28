// Bài 2
import java.util.Scanner;

public class XeMay {
    String ten, nhaSanXUat;
    int soLuongBanhXe;

    void nhapTHongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        ten = sc.nextLine();
        System.out.println("Nhap nha san xuat:");
        nhaSanXUat = sc.nextLine();
        System.out.println("Nhap so luong banh xe:");
        soLuongBanhXe = sc.nextInt();
    }

    void hienThiThongTin() {
        System.out.println("TEN: " + ten);
        System.out.println("NHA SX: " + nhaSanXUat);
        System.out.println("SO LUONG BANH XE: " + soLuongBanhXe);
    }

    public static void main(String[] args) {
        XeMay a = new XeMay();
        a.nhapTHongTin();
        a.hienThiThongTin();
    }
}
