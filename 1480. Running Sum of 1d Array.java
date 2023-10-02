class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] newNum = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            newNum[i] = sum;
        }
        return newNum;
    }
}

class Main {
    public static void main (String[] args) {
        int[] nums = {1, 2, 3, 4};
        Solution soln = new Solution();
        int[] newNums = soln.runningSum(nums);
        for (int i=0; i<newNums.length; i++) {
            System.out.println(newNums[i]);   
        }
    }
}