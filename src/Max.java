// Bài 7
import java.util.Scanner;

public class Max {
    int a, b, c, d;

    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = sc.nextInt();
        System.out.println("Nhap b:");
        b = sc.nextInt();
        System.out.println("Nhap c:");
        c = sc.nextInt();
        System.out.println("Nhap d:");
        d = sc.nextInt();
    }

    int Lnh(int x, int y) {
        if(x > y) {
            return x;
        } else {
            return y;
        }
    }

    int TimMax() {
        int max = Lnh(a, b);
        max = Lnh(max, c);
        max = Lnh(max, d);
        return max;
    }

    public static void main(String[] args) {
        Max m = new Max();
        m.Nhap();
        int maxNumber = m.TimMax();
        System.out.println("Max: " + maxNumber);
    }
}
