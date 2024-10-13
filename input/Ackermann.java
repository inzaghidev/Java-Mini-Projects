import java.util.Scanner;

public class Ackermann{
    public static int ack(int m, int n){
        if (m == 0){
            return n + 1;
        }
        else if((m > 0) && (n == 0)){
            return ack(m - 1, 1);
        }
        else if((m > 0) && (n > 0)){
            return ack(m - 1, ack(m, n - 1));
        }else
        return n + 1;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int x, y, A;
        System.out.println("Ackermann Function A(x, y)");
        System.out.print("Insert value of x : ");
        x = input.nextInt();
        System.out.print("Insert value of y : ");
        y = input.nextInt();
        A = ack(x, y);
        System.out.println("A("+x+", "+y+") = "+A);
    }
}