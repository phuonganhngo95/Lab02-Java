// Bài 3
import java.util.Scanner;

public class Sv {
    public static void main(String[] args) {
        String ten, ma;
        float diemLiThuyet, diemThucHanh;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        ten = sc.nextLine();
        System.out.println("Nhap ma: ");
        ma = sc.nextLine();
        System.out.println("Nhap diem li thuyet:");
        diemLiThuyet = sc.nextFloat();
        System.out.println("Nhap diem thuc hanh:");
        diemThucHanh = sc.nextFloat();

        if(diemLiThuyet < 4) {
            System.out.println("Thi lai li thuyet");
        }
        if(diemThucHanh < 4) {
            System.out.println("Thi lai thuc hanh");
        }

        float tb = (diemLiThuyet + diemThucHanh) / 2;
        if(tb < 4) {
            System.out.println("Sinh vien phai hoc lai");
        } else if (tb > 7){
            System.out.println("Sinh vien xuat sac mon Java");
        } else {
            System.out.println("Sinh vien dat mon Java");
        }
    }
}
