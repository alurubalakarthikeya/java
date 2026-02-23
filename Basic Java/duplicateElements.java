import java.util.*;
public class duplicateElements {
    public static void main(String args[]){
        int[] nums = {1,1,2};
        /*List<Integer> ans = new ArrayList<>();
        List<Integer> visited = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(visited.contains(nums[i])){
                ans.add(nums[i]);
            } else {
                visited.add(nums[i]);
            }
        }*/
       Arrays.sort(nums);
       List<Integer> ans = new ArrayList<>();
       for(int i = 0; i < nums.length-1; i++){
          if(nums[i]==nums[i+1] && !ans.contains(nums[i])){
            ans.add(nums[i]);
          }
        }
        System.out.print(ans);
    }
}