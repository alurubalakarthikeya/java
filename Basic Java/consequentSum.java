import java.util.Scanner;

public class consequentSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int first = (n - 3) / 3;
        int second = first + 1;
        int third = first + 2;
        
        System.out.println(first + " " + second + " " + third);
        sc.close();
    }
}
