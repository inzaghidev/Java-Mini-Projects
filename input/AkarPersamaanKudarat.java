import java.util.Scanner;
import static java.lang.Math.*;

public class AkarPersamaanKudarat {
    private static void PersamaanKuadrat(int a, int b, int c){
        float D,X1 = 0,X2=0;
        D=(b*b)-(4*a*c);
        if(D<0){
            System.out.println("Akar-Akar persamaan kuadratnya Imajiner");
        }
        else if(D>0){
            X1=(float) (-b + sqrt(D))/(2*a);
            X2=(float) (-b - sqrt(D))/(2*a);
        }
        else{
            X1=(float) (-b + sqrt(D))/(2*a);
            X2=X1;
        }
        
        System.out.println("Bentuk Persamaan :");
        System.out.println(a+"x^2 + "+b+"x + "+c+" = 0");
        
        System.out.println("\nAkar-Akar Persamaan Kuadratnya adalah :");
        System.out.println("X1 : "+X1);
        System.out.println("X2 : "+X2);
    }
    public static void main(String[] args) {
        int A,B,C;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan a : ");
        A=input.nextInt();
        System.out.print("Masukkan b : ");
        B=input.nextInt();
        System.out.print("Masukkan c : ");
        C=input.nextInt();
        System.out.println();

        PersamaanKuadrat(A, B, C);
    }
}