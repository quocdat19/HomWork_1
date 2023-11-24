package BTThem;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("width: ");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.println("length: ");
        int length = Integer.parseInt(scanner.nextLine());
        int v = (width + length) * 2;
        int s = width * length;

        System.out.println("Diện tích: " + s + " Chu vi: " + v);
    }
}
