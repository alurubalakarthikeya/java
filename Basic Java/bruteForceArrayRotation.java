import java.util.*;
public class bruteForceArrayRotation{
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void rotateRight(int[] arr){
        int last = arr[arr.length-1];
        for(int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        while(k!=0){
            rotateRight(arr);
            print(arr);
            k--;
        }
    }
}