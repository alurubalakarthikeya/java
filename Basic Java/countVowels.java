import java.util.Scanner;
public class countVowels {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int len = word.length();
        int isVowel = 0;
        while(len!=0){
            if(word.charAt(len)=='a'||word.charAt(len)=='e'||word.charAt(len)=='i'||word.charAt(len)=='o'||word.charAt(len)=='u'){
                isVowel += 1;
            }
            len -= 1;
        }
        System.out.print(isVowel);
        sc.close();
    }
}
