import java.util.stream.*;
import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        // int lPtr = 0;
        // int rPtr = nums.length -1, lastIndex = nums.length - 1;
        // int[] result = new int[nums.length];
        // int index = 0;
        // while(lPtr <= rPtr) {
        //     if(Math.abs(nums[lPtr]) <= Math.abs(nums[rPtr])) {
        //         result[index] = (int) Math.pow(nums[rPtr], 2);
        //         rPtr--;
        //     } else {
        //         result[index] = (int) Math.pow(nums[lPtr], 2);
        //         lPtr++;
        //     }
        //     index++;
        // }
        
        // for (int i = 0; i < result.length / 2; i++) {
        //     int t = result[i];
        //     result[i] = result[result.length - 1 - i];
        //     result[result.length - 1 - i] = t;
        // }
        
        // return result;
        return Arrays.stream(nums).map(e -> e * e).sorted().toArray();
    }
}