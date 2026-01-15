import java.util.Scanner;
public class linearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int flag = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i]==key){
                flag = i;
            }
        }
        if(flag==0){
            System.out.print("Element not found");
        } else{
            System.out.print("Element found at index: "+flag);
        }
    }
}
