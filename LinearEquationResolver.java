import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 1");
        System.out.println("Phuong trinh co dang ax + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        float a = scanner.nextFloat();
        System.out.println("Nhap b:");
        float b = scanner.nextFloat();
        System.out.println("Nhap c:");
        float c = scanner.nextFloat();
        if (a != 0) {
            float x = (c-b)/a;
            System.out.println("Phuong trinh co 1 nghiem x :\n " + x);
        }else {
            if (c!=b) {
                System.out.println("phuong trinh vo nghiem");
            }else {
                System.out.println("phuong trinh co vo so nghiem");
            }
        }
    }
}
