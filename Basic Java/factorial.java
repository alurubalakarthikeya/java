import java.util.Scanner;
public class factorial {
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        return num*factorial(num-1);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Factorial of the number is : "+factorial(num));
    }
}
