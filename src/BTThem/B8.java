package BTThem;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        int namSinh;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Năm Sinh: ");
            namSinh = Integer.parseInt(scanner.nextLine());
        }while(namSinh < 1900 && namSinh > 2023);

        int age = 2023 - namSinh;

        if(age % 2 == 0){
            System.out.println("tuổi chẵn!!");
        }
        else{
            System.out.println("tuổi lẻ!!");
        }


    }
}
