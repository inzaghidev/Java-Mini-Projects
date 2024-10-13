import java.util.Scanner;

public class Geometri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Deklarasi variabel
        double a, r, Sn;
        int n;
        
        // Input nilai awal, rasio, dan banyaknya suku
        System.out.println("Program Barisan & Deret Geometri");
        System.out.println("================================\n");

        System.out.print("Masukkan Suku Awal (a) : ");
        a = scan.nextDouble();
        
        System.out.print("Masukkan Rasio (r) : ");
        r = scan.nextDouble();
        
        System.out.print("Masukkan Banyak Suku (n) : ");
        n = scan.nextInt();
        
        System.out.println("\nBarisan Geometri : ");
        
        // Menampilkan Barisan Geometri
        for (int i = 0; i < n; i++) {
            double Un = a * Math.pow(r, i);  // Menghitung suku ke-i (U_n)
            System.out.print(Un + " ");
        }
        
        // Menghitung Deret Geometri (Jumlah S_n)
        if (r != 1) {
            Sn = a * (1 - Math.pow(r, n)) / (1 - r);
        } else {
            Sn = a * n;
        }
        
        System.out.println("\nDeret Geometri (Jumlah S_n): " + Sn);
    }
}