import java.util.Scanner;
public class simpleCal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("SUM: "+(num1+num2));
        System.out.println("DIFF: "+(num1-num2));
        System.out.println("PROD: "+(num1*num2));
        System.out.println("DIV: "+(num1/num2));
    }
}
