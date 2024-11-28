// Bài thực hành 2
import java.util.Scanner;

public class TanGai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Thấy gái:");
        System.out.println("1. Xinh, chưa có người yêu");
        System.out.println("2. Xinh, đã có người yêu");
        System.out.println("3. Xấu, nhà giàu");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Tán ngay");
                break;
            case 2:
                System.out.println("Tán luôn bạn trai của nàng");
                break;
            case 3:
                System.out.println("Tình yêu không có biên giới");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }
}