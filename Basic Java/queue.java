import java.util.*;
public class queue {
    static int front = 0;
    static int rear = -1;
    static int capacity;
    public static boolean isFull(int[] arr){
        return rear==(capacity-1);
    }
    public static boolean isEmpty(int[] arr){
        return rear < front;
    }
    public static void print(int[] arr){
        if(isEmpty(arr)){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void enqueue(int[] arr, int element){
        if(isEmpty(arr)){
            rear = front;
            arr[rear] = element;
        } else if(isFull(arr)){
            System.out.println("Queue is full");
        } else {
            rear += 1;
            arr[rear] = element;
        }
    }
    public static int dequeue(int[] arr){
        if(isEmpty(arr)){
            System.out.println("Queue is empty");
            return -1;
        }
        int digit = arr[front];
        front++;
        return digit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        capacity = arr.length;
        enqueue(arr, 70);
        print(arr);
                enqueue(arr, 80);
                print(arr);
                        enqueue(arr, 90);
                        print(arr);
                                enqueue(arr, 100);
                                print(arr);
                                dequeue(arr);
                                print(arr);
    }
}
