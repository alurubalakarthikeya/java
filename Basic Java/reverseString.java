import java.util.Scanner;
public class reverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String wordRev =  "";
        for(int i = word.length()-1; i >= 0; i--){
            wordRev += word.charAt(i);
        }
        System.out.print(wordRev);
    }
}
