import java.util.*;
public class siblingsNonUnique {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        int[] ages = new int[3];
        for(int i = 0; i < 3; i++){
            names[i] = sc.nextLine();
        }
        for(int j = 0; j < 3; j++){
            ages[j] = sc.nextInt();
        }
        if(ages[1] == ages[0] && age[1] == ages[2]){
            System.out.print(names[0]+" "+names[1]+" "+names[2]+" are triplets");
        } 
        if(ages[0] == ages[1] && ages[2]>ages[0]){
            System.out.print(names[0]+" "+names[1]+" "+names[2]+" are triplets");
        }
        int maxIndex = 0, minIndex = 0, midIndex = 0;
        //  20       10          20        30
        if (ages[1] > ages[0] && ages[1] > ages[2]){
            maxIndex = 1;
        } else if (ages[2] > ages[1] && ages[2] > ages[0]){
            maxIndex = 2;
        }//  20       10          20        30
        if (ages[1] < ages[0] && ages[1] < ages[2]){
            minIndex = 1;
        } else if (ages[2] < ages[1] && ages[2] < ages[0]){
            minIndex = 2;
        }//  20       10          20        30
        if (ages[1] > ages[0] && ages[1] < ages[2]){
            midIndex = 1;
        } else if (ages[2] > ages[1] && ages[2] < ages[0]){
            midIndex = 2;
        }
        System.out.println(names[maxIndex]+" is the oldest");
        System.out.println(names[midIndex]+" is the middle");
        System.out.println(names[minIndex]+" is the youngest");
    }
}
