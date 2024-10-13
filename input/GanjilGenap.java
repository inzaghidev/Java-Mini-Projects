import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil, batas;

        System.out.println("-----------------------------------");
        System.out.println("Program Deret Bilangan Ganjil Genap");
        System.out.println("-----------------------------------");
        System.out.println("1. Ganjil                          ");
        System.out.println("2. Genap                           ");
        System.out.println("-----------------------------------");
        System.out.print("Masukan Pilihan : ");
        pil = input.nextInt();
        System.out.print("Masukan Batas   : ");
        batas = input.nextInt();

        if (pil == 1) {
            System.out.println("Deret Bilangan Ganjil");
            for (int i = 1; i <= batas; i++) {
                if (i % 2 != 0)
                    System.out.print(i + " ");
            }
        } else if (pil == 2) {
            System.out.println("Deret Bilangan Genap");
            for (int i = 1; i <= batas; i++) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}