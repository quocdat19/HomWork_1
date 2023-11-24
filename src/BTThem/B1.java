package BTThem;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số nguyên cần nhập: ");
        int a = Integer.parseInt(scanner.nextLine());

        int x = a * a;
        System.out.printf("Bình phương của a là: %d", x);
    }

}
