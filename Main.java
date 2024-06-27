import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bi sayı giriniz : ");

        int K = scanner.nextInt();
        int A = 1;
        int B = 0;
        int C;
        int D = 0;
        int E = 1;
        while (B <=1000000){
            C = A + B;
            D++;
            System.out.println(D + " " + C);
            if (K == D){
                //K = D + E;
                System.out.println(K + " Dizi de Fibbonacci : " + C );
                break;
            }
            A = C + B;
            D++;
            System.out.println(D + " " + A);
            if (K == D){
                //K = D + E;
                System.out.println(K + " Dizi de Fibbonacci : " + A );
                break;
            }
            B = A + C;
            D++;
            System.out.println(D + " " + B);
            if (K == D){
                //K = D + E;
                System.out.println(K + " Dizi de Fibbonacci : " + B );
                break;
            }
        }
    }
}