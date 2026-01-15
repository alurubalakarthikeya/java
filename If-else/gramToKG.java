import java.util.*;
public class gramToKG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grams = sc.nextInt();
        int kg = grams / 1000;
        int remainingGrams = grams % 1000;
        System.out.print(kg+" kilograms ");
        System.out.print(remainingGrams+" grams");
    }
}