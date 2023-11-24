import java.sql.SQLOutput;
import java.util.Scanner;

public class MoneyApplication {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("USD: ");
        int USD = Integer.parseInt(scanner.nextLine());
        int VND = rate * USD;
        System.out.println("VND: " + VND);
    }
}
