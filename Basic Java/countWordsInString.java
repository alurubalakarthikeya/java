import java.util.Scanner;
public class countWordsInString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(s.split(" ").length);
    }
}
