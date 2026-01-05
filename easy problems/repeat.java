import java.util.Scanner;
public class repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String number = sc.nextLine();
        System.out.println("Non-repeated digits: " + getNonRepeatedDigits(number));
    }

    public static String getNonRepeatedDigits(String number) {
        StringBuilder nonRepeatedDigits = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (number.indexOf(digit) == number.lastIndexOf(digit)) {
                nonRepeatedDigits.append(digit);
            }
        }
        return nonRepeatedDigits.toString();
    }
}
