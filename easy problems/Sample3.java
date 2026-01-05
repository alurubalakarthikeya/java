class Addition {
    int add(int a, int b){
        return a+b;
    }
    float add(float b, int a){
        return a+b;
    }

    float add(float a, float b, float c){
        return a+b+c;
    }
}
public class Sample3 {
    public static void main(String args[]){
        Addition a = new Addition();
        int sum = a.add(10, 5);
        int anothersum =  a.add(10, 5);
        float moresum = a.add(10, 5, 2);
        System.out.println(sum);
        System.out.println(anothersum);
        System.out.println(moresum);
    }
}