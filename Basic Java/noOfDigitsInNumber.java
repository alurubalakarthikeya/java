import java.util.Scanner;
public class noOfDigitsInNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nod = 0;
        while(num > 0){
            num /= 10;
            nod += 1;
        }
        System.out.print(nod);
    }
}
