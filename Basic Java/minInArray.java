import java.util.Scanner;
public class minInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        int small = 10;
        for(int i = 0; i < 10; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.print(small);
    }
}
