import java.util.Scanner;
public class palindromeNumberOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(num>0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if(temp==rev){
            System.out.print("This number is a palindrome number");
        } else {
            System.out.print("This number is not a palindrome number");
        }
    }
}
