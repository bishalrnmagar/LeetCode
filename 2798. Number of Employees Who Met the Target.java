class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int empHr: hours) {
            if (empHr >= target) {
                count += 1;
            }
        }
        return count;
    }
}

public class Main
{
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] hours = {0,1,2,3,4};
		int target = 2;
		int output = sol.numberOfEmployeesWhoMetTarget(hours, target);
		System.out.println(output);
	}
}
