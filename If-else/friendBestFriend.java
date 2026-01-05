import java.util.Scanner;
public class friendBestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name; ");
        String myName = sc.nextLine();
        System.out.print("Enter your Best Friend's name; ");
        String bestFriendName = sc.nextLine();
        System.out.println(" My name is "+myName+" and my Best Friend's name is " +bestFriendName);
    }
}
