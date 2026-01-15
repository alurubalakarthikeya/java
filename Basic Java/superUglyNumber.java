import java.util.*;
public class superUglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noe = sc.nextInt();
        int[] prime_arr = new int[noe];
        for(int i = 0; i < noe; i++){
            prime_arr[i] = sc.nextInt();
        }
        int nth_ugly = sc.nextInt();
        int ctr = 1;
        int num = 2;
        int work_num = num;
        int work_ind = 0;
        while(work_num<=num){
            if(work_num%prime_arr[work_ind]!=0){
                continue;
            } else {
            
            }
        }
    }
}
