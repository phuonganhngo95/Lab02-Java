// Bài 6
import java.util.Scanner;

public class TamGiac {
    float a, b, c, h;
    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = sc.nextFloat();
        System.out.println("Nhap b:");
        b = sc.nextFloat();
        System.out.println("Nhap c:");
        c = sc.nextFloat();
        System.out.println("Nhap chieu cao:");
        h = sc.nextFloat();
    }

    boolean Triangle() {
        if(a!=0 && b!=0 && c!=0) {
            if(a+b>c || a+c>b || b+c>a) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    float Perimeter() {
        if (Triangle() == true)
            return a+b+c;
        return 0;
    }

    float Area() {
        if (Triangle() == true) {
            return (float)0.5*b*h;
        }
        return 0;
    }

    public static void main(String[] args) {
        TamGiac a = new TamGiac();
        a.Nhap();
        a.Triangle();
        System.out.println("Chu vi: " + a.Perimeter());
        System.out.println("Dien tich: " + a.Area());
    }
}
