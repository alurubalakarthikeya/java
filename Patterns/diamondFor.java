package Patterns;
import java.util.Scanner;
public class diamondFor {
    public static void main(String args[]) {
        char letter = 'A';
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.printf("%c", letter);
                letter += 1;
                if(letter > 'Z'){
                    letter = 'A';
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 3; j++) {
                System.out.printf("%c", letter);
                letter += 1;
                if(letter > 'Z'){
                    letter = 'A';
                }
            }
            System.out.println();
        }
    }
}
