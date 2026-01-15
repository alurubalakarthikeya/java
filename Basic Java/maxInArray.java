import java.util.Scanner;
public class maxInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        int large = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        System.out.print(large);
    }
}
