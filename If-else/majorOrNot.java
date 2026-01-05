import java.util.Scanner;
public class majorOrNot { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.print("You are a Major, You are eligible to vote");
        } else if(age < 0 || age>100){
            System.out.print("Enter a valid age");
        } else {
            System.out.print("You are a Minor, You are not eligible to vote");
        }
    }
}
