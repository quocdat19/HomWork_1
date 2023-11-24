package BTThem;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        int MAX, MIN;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("c: ");
        int c = Integer.parseInt(scanner.nextLine());
        MAX = MIN = a;
        if (b > MAX)
            MAX = b;
        if (c > MAX)
            MAX = c;

        System.out.println("Gía trị lớn nhất là:" + MAX);

        if (b < MIN)
            MIN = b;
        if (c < MIN)
            MIN = c;

        System.out.println("Gía trị nhỏ nhất là:" + MIN);


    }
}
