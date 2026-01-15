import java.util.Scanner;
public class sumOfN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sumLoop = 0;
        int sumFormula = 0;
        for(int i = 0; i <= num; i++){
            sumLoop += i;
        }
        sumFormula = (num*(num+1))/2;
        System.out.println(sumLoop);
        System.out.println(sumFormula);
    }
}
