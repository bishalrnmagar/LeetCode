import java.util.List;
import java.util.Arrays;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        
        for (int i=0; i<nums.size(); i++) {
            for (int j=i+1; j<nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
                
            }
        }
        
        return count;
    }
}

class Main {
    public static void main (String[] args) {
        List<Integer> nums = Arrays.asList(-1,1,2,3,1); //[-1,1,2,3,1]
        int target = 2;
        Solution soln = new Solution();
        int result = soln.countPairs(nums, target);
        System.out.println(result);
    }
}