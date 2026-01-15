import java.util.*;
public class nthDigit{
    static int count = 0;
    static int track = 1;
    public static void recursiveSolution(int num){
        count += 1;
        
        recursiveSolution(num+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        recursiveSolution(number);
    }
}