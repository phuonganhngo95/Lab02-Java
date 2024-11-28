// Bài thực hành 1
import java.util.Scanner;

public class SinhVien {
    String name, address;
    int soLanThi;
    float diemJava;
    double lePhiThi;
    char gioiTinh; // Nam = M, Nu = F

    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap dia chi:");
        address = sc.nextLine();
        System.out.println("Nhap so lan thi:");
        soLanThi = sc.nextInt();
        System.out.println("Nhap diem Java:");
        diemJava = sc.nextFloat();
        System.out.println("Nhap le phi thi:");
        lePhiThi = sc.nextDouble();
        System.out.println("Nhap gioi tinh:");
        gioiTinh = sc.next().charAt(0);
    }

    void xuatThongTin() {
        System.out.println("TEN: " + name);
        System.out.println("DIA CHI: " + address);
        System.out.println("SO LAN THI: " + soLanThi);
        System.out.println("DIEM JAVA: " + diemJava);
        System.out.println("LE PHI THI: " + lePhiThi);
        System.out.println("GIOI TINH: " + gioiTinh);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        sv.xuatThongTin();
    }
}
