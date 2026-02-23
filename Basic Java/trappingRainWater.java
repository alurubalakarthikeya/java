public class trappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int len = height.length;
        if (len == 0) System.out.println(":(");
        int[] lhigh = new int[len];
        int[] rhigh = new int[len];
        int Llargest = 0;
        for (int i = 0; i < len; i++) {
            Llargest = Math.max(Llargest, height[i]);
            lhigh[i] = Llargest;
        }
        int Rlargest = 0;
        for (int i = len - 1; i >= 0; i--) {
            Rlargest = Math.max(Rlargest, height[i]);
            rhigh[i] = Rlargest;
        }
        int filler = 0;
        for (int i = 0; i < len; i++) {
            filler += Math.min(lhigh[i], rhigh[i]) - height[i];
        }
        System.out.println(filler);
    }
}
