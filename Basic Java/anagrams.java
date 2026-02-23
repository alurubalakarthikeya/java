import java.util.*;
public class anagrams {
    public static boolean checkAnagram(String word1, String word2){
        if(word1.length()!=word2.length()){
            return false;
        }
        char[] wordone = word1.toCharArray();
        char[] wordtwo = word2.toCharArray();
        Arrays.sort(wordone);
        Arrays.sort(wordtwo);
        return Arrays.equals(wordone, wordtwo);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        boolean check = checkAnagram(word1, word2);
        if(check){
            System.out.println("These words are anagrams");
        } else {
            System.out.println("These words arent anagrams");
        }
    }
}
