import java.util.Scanner;
public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fibo = 0;
        int fiboPlus = 1;
        while (fiboPlus<num){
            System.out.print(fibo+" ");
            int sum = fibo + fiboPlus;
            fibo = fiboPlus;
            fiboPlus = sum;
        }
    }
}
