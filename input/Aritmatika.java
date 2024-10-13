import java.util.Scanner;

public class Aritmatika{
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int a,b,n,i,hasil;
        System.out.println("Program Barisan Deret Aritmatika");
        System.out.println("================================");

        System.out.print("Masukan Suku Awal : ");
        a = scan.nextInt();
        System.out.print("Masukan Banyak Suku : ");
        n = scan.nextInt();
        System.out.print("Masukan Beda : ");
        b = scan.nextInt();

        System.out.println("Barisan Aritmatika : ");
        for(i=0;i<n;i++){
        System.out.print(a+(i*b) +" ");
        }
        System.out.print("\nDeret Aritmatika : "+ (2*a+(n-1)*b)*n/2);
    }
}