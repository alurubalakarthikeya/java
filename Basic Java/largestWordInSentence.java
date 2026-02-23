import java.util.Scanner;
public class largestWordInSentence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int[] count = new int[100];
        int iter = 0;
        for(int i = 0; i < sentence.length(); i+=1){
            if(sentence.charAt(i)!=' '){
                count[iter]+=1;

            } else {
                iter += 1;
            }
        }
        int large = 0;
        int largeIndex = 0;
        for(int i = 0; i < count.length; i+=1){
            if(large<count[i]){
                large = count[i];
                largeIndex = i;
            }
        }
        String[] words = sentence.split(" ");
        System.out.print(words[largeIndex]);
    }
}
