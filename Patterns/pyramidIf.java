package Patterns;
import java.util.Scanner;
public class pyramidIf{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
                for(int j = i; j < n; j++){
                    if(n && n-j<=i){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
}