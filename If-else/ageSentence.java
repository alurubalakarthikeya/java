import java.util.*;
public class ageSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age == 1){
            System.out.print("I am "+ age+" year old");
        } else {
        System.out.print("I am "+ age+" years old");
        }
    }
}
