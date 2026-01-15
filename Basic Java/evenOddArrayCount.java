import java.util.Scanner;
public class evenOddArrayCount {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i]%2==0){
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println(even);
        System.out.print(odd);
    }
}
