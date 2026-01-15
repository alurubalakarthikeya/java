import java.util.*;
public class windMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<1){
            System.out.println("Calm");
        }
        if(num>=4 && num<=7){
            System.out.println("Light Breeze");
        }
        if(num>=13 && num<=18){
            System.out.println("Moderate Breeze");
        }
        if(num>=25 && num<=31){
            System.out.println("Strong Breeze");
        }
        if(num>=39 && num<=46){
            System.out.println("Gale");
        }
        if(num>=55 && num <=63){
            System.out.println("Strom");
        }
        if(num>74){
            System.out.println("Hurricane");
        }
    }
}
