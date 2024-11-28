// Bài 1
import java.util.Scanner;

public class Person {
    private String name, address;
    private double salary;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = sc.nextLine();
        System.out.println("Nhap dia chi:");
        address = sc.nextLine();
        System.out.println("Nhap luong:");
        salary = sc.nextDouble();
    }

    void view() {
        System.out.println("TEN: " + name);
        System.out.println("DIA CHI: " + address);
        System.out.println("LUONG: " + salary);
    }

    public static void main(String[] args) {
        Person a = new Person();
        a.input();
        a.view();
    }
}
