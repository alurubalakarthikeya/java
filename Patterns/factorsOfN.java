package Patterns;
import java.util.*;
public class factorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factors of num: ");   
        for(int i = 1; i*i <= num; i++){
            if(num%i==0){
                System.out.print(" " + i);
            }
        }
    }    
}
