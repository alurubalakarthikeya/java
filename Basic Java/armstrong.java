import java.util.Scanner;
public class armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int tempCheck = num;
        int nod = 0;
        while(num > 0){
            num /= 10;
            nod += 1;
        }
        int sum = 0;
        while(temp>0){
            int digit = temp % 10;
            sum += Math.pow(digit, nod);
            temp /= 10;
        }
        if(tempCheck == sum){
            System.out.print("This is an armstrong number");
        } else {
            System.out.print("This isnt an armstrong number");
        }
    }
}
