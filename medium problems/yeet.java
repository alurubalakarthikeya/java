import java.util.*;
public class yeet {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        int num = scanner.nextInt();
        int result = (num == 1) ? 2:1;
        System.out.println(result);
    }
}