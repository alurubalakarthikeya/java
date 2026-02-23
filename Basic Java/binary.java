import java.util.*;
public class binary {
    public static void binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(key==arr[mid]){
                System.out.print("Element found");
                return;
            } else if (key<arr[mid]){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {21, 54, 23, 56, 26, 67, 34, 78, 90, 36, 27};
        int key = sc.nextInt();
        binarySearch(arr, key);
    }
}
