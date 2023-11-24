package BTThem;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        float toan, van, anh;
        float tb;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("toan: ");
            toan = Float.parseFloat(scanner.nextLine());
        }while(toan < 0 && toan > 10);

        do{
            System.out.println("ly: ");
            van = Float.parseFloat(scanner.nextLine());
        }while(van < 0 || van > 10);

        do{
            System.out.println("hoa: ");
            anh = Float.parseFloat(scanner.nextLine());
        }while(anh < 0 || anh > 10);

        tb = (toan + van + anh) / 3;
        System.out.printf("\nĐiểm trung bình là: %.2f", tb);

    }
}
