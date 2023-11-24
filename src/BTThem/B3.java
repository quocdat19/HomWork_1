package BTThem;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        final double PI = 3.1415926535897;
        float r;
        double S;
        double P;
        Scanner scanner = new Scanner(System.in);
        System.out.println("r: ");
        r = Float.parseFloat(scanner.nextLine());

        S =  PI * r * r;
        System.out.printf("\nDiện tích hình tròn là: %.2f", S);
        P = PI * r * 2;
        System.out.printf("\nChu vi hình tròn là: %.2f", P);



    }
}
