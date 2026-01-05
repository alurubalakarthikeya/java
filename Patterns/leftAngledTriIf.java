package Patterns;
import java.util.Scanner;
public class leftAngledTriIf{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n+1; j++){
                if(n-i>=j){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}