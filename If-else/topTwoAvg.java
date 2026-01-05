import java.util.*;
public class topTwoAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        int avg = 0;
        if(t1>t2 && t1>t3){
            if(t2>t3){
                avg = (t2+t1)/2;
            } else {
                avg = (t3+t1)/2;
            }
        }
        if(t2>t1 && t2>t3){
            if(t1>t3){
                avg = (t2+t1)/2;
            } else {
                avg = (t3+t2)/2;
            }
        }
        if(t3>t2 && t3>t1){
            if(t1>t2){
                avg = (t3+t1)/2;
            } else {
                avg = (t3+t2)/2;
            }
        }
        System.out.print(avg);
    }
}
