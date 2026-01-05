import java.util.Scanner;
public class siblingsAge {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myName = sc.nextLine();
        System.out.print("Enter your sibling's name: ");
        String siblingName = sc.nextLine();
        System.out.print("Enter your age: ");
        int myAge = sc.nextInt();
        System.out.print("Enter your sibling's age: ");
        int siblingAge = sc.nextInt();
        if(siblingAge>myAge){
            System.out.print(siblingName+" is older than "+myName);
        }
    }
}
