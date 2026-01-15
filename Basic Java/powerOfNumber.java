import java.util.Scanner;
public class powerOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int pow = sc.nextInt();
        int prod = 1;
        for(int i = 0; i < pow; i++){
            prod = prod * base;
        }
        System.out.print(prod);
    }
}
