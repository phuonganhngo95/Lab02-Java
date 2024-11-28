// Bài thực hành 1
import java.util.Scanner;

public class DuBaoThoiTiet {
    int status;

    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chương trình dự báo thời tiết Chuồn chuồn");
        System.out.println("1. Bay thấp");
        System.out.println("2. Bay cao");
        System.out.println("3. Bay vừa");
        System.out.println("4. Say rượu nên không biết gì");
        System.out.println("Mời nhập từ 1-->4");
        status = sc.nextInt();
    }

    void Xuat() {
        switch (status) {
            case 1:
                System.out.println("Dự báo: Mưa, khi ra khỏi nhà nhớ mang áo mưa");
                break;
            case 2:
                System.out.println("Dự báo: Nắng, nhớ mang ô nhé");
                break;
            case 3:
                System.out.println("Dự báo: Râm, mát giời");
                break;
            case 4:
                System.out.println("Dự báo: Xin lỗi, do nhậu say nên không trả lời");
                break;
            default:
                System.out.println("Chuồn chuồn thử *beep* 404 lần nhưng không có kết quả");
                break;
        }
    }

    public static void main(String[] args) {
        DuBaoThoiTiet thoitiet = new DuBaoThoiTiet();
        thoitiet.Nhap();
        thoitiet.Xuat();
    }
}
