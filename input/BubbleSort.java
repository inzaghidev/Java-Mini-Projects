import java.util.Scanner;

public class BubbleSort{
    static Scanner scan = new Scanner(System.in);
    int data[] = new int[20];
    static int Nilai[] = new int[20];

    static void prosesPerpindahan(int data[],int y){
        int x;
        for(x=0;x<y;x++){
            System.out.print(data[x]+" ");
        }
    }

    static void prosesSorting(int data[],int y){
        int proses,x,tampung;
    
        for(proses=1;proses<y;proses++){
            for(x=0;x<y-proses;x++) {
                if(data[x]>data[x+1]){
                    tampung=data[x];
                    data[x]=data[x+1];
                    data[x+1]=tampung;
                }
            }
        System.out.print("\nTahap Ke-"+proses+" : ");
        prosesPerpindahan(data,y);
        }
    }

    public static void main(String args[]){
        int i, N;
        
        System.out.print("Masukkan Banyak Bilangan : ");
        N = scan.nextInt();
        
        for(i=0; i<N; i++){
            System.out.print("Elemen ke-"+(i+1)+" : ");
            Nilai[i] = scan.nextInt();
        }
        
        System.out.print("\nProses Sorting dengan metode Bubble Sort : ");
        prosesSorting(Nilai,N);

        System.out.println("\n\nSetelah Di Urutkan dengan Bubble Sort : ");
        prosesPerpindahan(Nilai,N);
    }
}