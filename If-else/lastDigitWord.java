import java.util.Scanner;

public class lastDigitWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int lastDigit = number % 10;
        if(lastDigit == 0){
            System.out.println("Zero");
        } else if(lastDigit == 1){
            System.out.println("One");
        } else if(lastDigit == 2){
            System.out.println("Two");
        } else if(lastDigit == 3){
            System.out.println("Three");
        } else if(lastDigit == 4){
            System.out.println("Four");
        } else if(lastDigit == 5){
            System.out.println("Five");
        } else if(lastDigit == 6){
            System.out.println("Six");
        } else if(lastDigit == 7){
            System.out.println("Seven");
        } else if(lastDigit == 8){
            System.out.println("Eight");
        } else if(lastDigit == 9){
            System.out.println("Nine");
        }
    }
}
