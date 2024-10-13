import java.util.Scanner;

public class FaktorialIteratif {
  public static void main(String[] args) {

    System.out.println("--------------------------------");
    System.out.println("Program Pangkat Bilangan");
    System.out.println("--------------------------------");

    int hasil = 1;
    int angka, pangkat;

    Scanner a = new Scanner(System.in);
    System.out.print("Angka : ");
    angka = a.nextInt();

    Scanner b = new Scanner(System.in);
    System.out.print("Pangkat : ");
    pangkat = b.nextInt();

    for (int i = 1; i <= pangkat; i++) {
      hasil = hasil * angka;
    }

    System.out.println("Hasil : " + hasil);
  }
}