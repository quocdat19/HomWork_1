import java.util.Scanner;

public class DiemTB {
    public static void main(String[] args) {
        float TB;
        float toan, ly, hoa, van, ta;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("toan: ");
            toan = Float.parseFloat(scanner.nextLine());
        }while(toan < 0 && toan > 10);

        do{
            System.out.println("ly: ");
            ly = Float.parseFloat(scanner.nextLine());
        }while(ly < 0 || ly > 10);

        do{
            System.out.println("hoa: ");
            hoa = Float.parseFloat(scanner.nextLine());
        }while(hoa < 0 || hoa > 10);

        do{
            System.out.println("van: ");
            van = Float.parseFloat(scanner.nextLine());
        }while(van < 0 || van > 10);

        do{
            System.out.println("ta: ");
            ta = Float.parseFloat(scanner.nextLine());
        }while(ta < 0 || ta > 10);

        TB = (toan + ly + hoa + van + ta) / 5;

        if (0 <= TB && TB < 5)
        {
            System.out.println("Xếp loại yếu"+ " Điểm trung bình: "  + TB);
        }
        else if (5 <= TB && TB < 6.5)
        {
            System.out.println("Xếp loại trung bình"+ " Điểm trung bình: "  + TB);
        }
        else if (6.5 <= TB && TB < 8)
        {
            System.out.println("Xếp loại khá"+ " Điểm trung bình: "  + TB);
        }
        else if (8 <= TB && TB < 9)
        {
            System.out.println("Xếp loại giỏi" + " Điểm trung bình: " + TB);
        }
        else
        {
            System.out.println("Xếp loại xuất sắc" + " Điểm trung bình: "  + TB);
        }
    }
}
