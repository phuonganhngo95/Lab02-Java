// Bài 14
import java.util.Scanner;

public class TienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập liệu
        System.out.print("Nhap chi so cu: ");
        int chiSoCu = scanner.nextInt();
        System.out.print("Nhap chi so moi: ");
        int chiSoMoi = scanner.nextInt();

        // Kiểm tra điều kiện chỉ số
        if (chiSoMoi <= chiSoCu) {
            System.out.println("Moi nhap lai");
            return;
        }

        // Tính toán
        int soKWTieuThu = chiSoMoi - chiSoCu;
        int dinhMuc = 50;
        int tienThueBao = 1000;
        int tienDienDinhMuc = dinhMuc * 230;
        int soKWVuotDinhMuc = soKWTieuThu - dinhMuc;

        int tienDienVuotDinhMuc;
        if (soKWVuotDinhMuc <= 0) {
            tienDienVuotDinhMuc = 0;
        } else if (soKWVuotDinhMuc <= 50) {
            tienDienVuotDinhMuc = soKWVuotDinhMuc * 480;
        } else if (soKWVuotDinhMuc <= 100) {
            tienDienVuotDinhMuc = 50 * 480 + (soKWVuotDinhMuc - 50) * 700;
        } else {
            tienDienVuotDinhMuc = 50 * 480 + 50 * 700 + (soKWVuotDinhMuc - 100) * 900;
        }

        int tongTien = tienThueBao + tienDienDinhMuc + tienDienVuotDinhMuc;

        System.out.println("Chi so cu: " + chiSoCu);
        System.out.println("Chi so moi: " + chiSoMoi);
        System.out.println("Tien tra dinh muc: " + tienDienDinhMuc);
        System.out.println("Tien tra vuot dinh muc: " + tienDienVuotDinhMuc);
        System.out.println("Tong tien: " + tongTien);
    }
}