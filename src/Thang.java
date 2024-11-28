// Bài 8
import java.util.Scanner;

public class Thang {
    public static void main(String[] args) {
        int thang;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang:");
        thang = sc.nextInt();

        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Thang co 30 ngay");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Thang co 31 ngay");
            case 2:
                System.out.println("Nhap nam:");
                int nam = sc.nextInt();
                if(nam % 4 == 0) {
                    System.out.println("Thang co 29 ngay");
                    break;
                } else {
                    System.out.println("Thang co 28 ngay");
                    break;
                }
        }
    }
}
