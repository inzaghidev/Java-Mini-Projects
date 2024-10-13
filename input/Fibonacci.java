import java.util.Scanner;

public class Fibonacci{
    public static void main(String[]args) {
        Scanner show = new Scanner(System.in);
        int n, f1 = 0, f2 = 1, next = 0;
        System.out.println("PROGRAM DERET BILANGAN FIBONACCI");
        System.out.print("Masukan Batas Deret Bilangan Fibonacci : ");
        n = show.nextInt();
        System.out.print("Deret Fibonacci : ");
         
        for (int i = 1; i <= n; ++i){
            if(i == 1){
                System.out.print(" " + f1 + " ");
                continue;
            }
            if(i == 2){
                System.out.print(f2 + " ");
                continue;
            }
            next = f1 + f2;
            f1 = f2;
            f2 = next;
            System.out.print(next + " ");
        }
    }
}