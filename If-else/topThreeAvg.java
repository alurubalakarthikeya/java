import java.util.Scanner;
public class topThreeAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        int t4 = sc.nextInt();
        int avg = 0;
        if(t1>t2 && t1>t3 && t1>t4){
            if(t2>t3 && t2 > t4){
                if(t3>t4){
                    avg = (t1+t2+t3)/3;
                } else {
                    avg = (t2+t1+t4)/2;
                }
            } else if(t3>t2 && t3 > t4){
                if(t2>t4){
                    avg = (t1+t2+t3)/3;
                } else {
                    avg = (t1+t3+t4)/2;
                }
            } else {
               if(t2>t3){
                    avg = (t1+t2+t4)/3;
                } else {
                    avg = (t1+t3+t4)/2;
                }
            }
        }
        if(t2>t1 && t2>t3 && t2>t4){
            if(t1>t3 && t1>t4){
                if(t3>t4){
                    avg = (t2+t1+t3)/3;
                } else {
                    avg = (t2+t1+t4)/3;
                }
            } else if(t3>t1 && t3>t4){
                if(t1>t4){
                    avg = (t2+t3+t1)/3;
                } else {
                    avg = (t2+t3+t4)/3;
                }
            } else {
                if(t1>t3){
                    avg = (t2+t4+t1)/3;
                } else {
                    avg = (t2+t4+t3)/3;
                }
            }
        }
        if(t3>t1 && t3>t2 && t3>t4){
            if(t1>t2 && t1>t4){
                if(t2>t4){
                    avg = (t3+t1+t2)/3;
                } else {
                    avg = (t3+t1+t4)/3;
                }
            } else if(t2>t1 && t2>t4){
                if(t1>t4){
                    avg = (t3+t2+t1)/3;
                } else {
                    avg = (t3+t2+t4)/3;
                }
            } else {
                if(t1>t2){
                    avg = (t3+t4+t1)/3;
                } else {
                    avg = (t3+t4+t2)/3;
                }
            }
        }
        if(t4>t1 && t4>t2 && t4>t3){
            if(t1>t2 && t1>t3){
                if(t2>t3){
                    avg = (t4+t1+t2)/3;
                } else {
                    avg = (t4+t1+t3)/3;
                }
            } else if(t2>t1 && t2>t3){
                if(t1>t3){
                    avg = (t4+t2+t1)/3;
                } else {
                    avg = (t4+t2+t3)/3;
                }
            } else {
                if(t1>t2){
                    avg = (t4+t3+t1)/3;
                } else {
                    avg = (t4+t3+t2)/3;
                }
            }
        }
        System.out.print(avg);
    }
}
