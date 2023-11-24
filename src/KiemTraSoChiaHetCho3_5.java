import java.util.Scanner;

public class KiemTraSoChiaHetCho3_5 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        a = Integer.parseInt(scanner.nextLine());

        if (a % 3 == 0 && a % 5 == 0)
        {
            System.out.println("Chia hết cho cả 3 và 5");
        }
        else if (a % 3 == 0 && a % 5 != 0)
        {
            System.out.println("Chia hết cho 3");
        }
        else if (a % 3 != 0 && a % 5 ==0)
        {
            System.out.println("Chia hết cho 5");
        }
        else
        {
            System.out.println("Không chia hết cho 3 , cũng không chia hết cho 5");
        }
    }
}
