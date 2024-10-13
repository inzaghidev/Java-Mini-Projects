import java.util.Scanner;

public class Covid19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ptv, death, recov, act, out;

        System.out.println("Program menghitung Data Kasus COVID-19");
        System.out.print("Kasus Terkonfirmasi Positif : ");
        ptv = input.nextInt();
        System.out.print("Kasus Kematian : ");
        death = input.nextInt();
        System.out.print("Kasus Kesembuhan : ");
        recov = input.nextInt();

        out = death + recov;
        act = ptv - out;

        System.out.println("==== Data Kasus COVID-19 ====");
        System.out.println("Kasus Positif    : " + ptv);
        System.out.println("Kasus Kematian    : " + death);
        System.out.println("Kasus Pulih    : " + recov);
        System.out.println("Kasus Aktif    : " + act);
        System.out.println("Kasus Pasif    : " + out);
        System.out.println("=============================");
    }
}