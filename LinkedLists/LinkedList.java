import java.util.*;
class Main {
    public static void traverse(Node head){
        Node iter = head;
        while(iter!=null){
            System.out.print(iter.data+" -> ");
            iter = iter.next;
        }
        System.out.println();
    }
    public static void insertAtEnd(Node head, int data){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(data, null);
        traverse(head);
    }
    public static void searchKey(Node head, int key){
        Node ptr = head;
        int counter = 0;
        while(ptr!=null){
            counter += 1;
            if(ptr.data==key){
                System.out.print("Key found at "+counter+"th node");
            }
            ptr = ptr.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        Node pointer = null;
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            if(head==null){
                head = new Node(data, null);
                pointer = head;
            } else {
                pointer.next = new Node(data, null);
                pointer = pointer.next;
            }
        }
        traverse(head);
        int data = sc.nextInt();
        insertAtEnd(head, data);
        int search = sc.nextInt();
        searchKey(head, search);
    }
}
class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}