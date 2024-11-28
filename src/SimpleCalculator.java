// Bài thực hành 2
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int soA, soB;
        double kq = 0.0;
        String pheptinh;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter so A:");
        soA = sc.nextInt();
        System.out.println("Enter so B:");
        soB = sc.nextInt();
        sc.nextLine();
        System.out.println("Phep tinh:");
        pheptinh = sc.nextLine();

        // Thuc hien tinh toan
        switch (pheptinh) {
            case "+":
                kq = soA + soB;
                break;
            case "-":
                kq = soA - soB;
                break;
            case "*":
                kq = soA * soB;
                break;
            case "/":
                kq = (float) soA / soB;
                break;
            case "%":
                kq = soA % soB;
                break;
        }
        System.out.println("Ket qua: " + kq);
    }
}
