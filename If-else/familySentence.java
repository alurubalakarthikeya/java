import java.util.Scanner;
public class familySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name; ");
        String myName = sc.nextLine();
        System.out.print("Enter your Dad's name; ");
        String dadName = sc.nextLine();
        System.out.print("Enter your Mom's name; ");
        String momName = sc.nextLine();
        System.out.println(" My name is "+myName+" and I am proud child of " +dadName+" and "+momName);
    }
}
