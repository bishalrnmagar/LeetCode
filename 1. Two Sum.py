"""
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
"""
class Solution(object):
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        i = 0
        j = i + 1
        numMap = {}
        for i in range(len(nums)-1):
            for j in range(len(nums)):
                if nums[i] + nums[j] == target:                  
                    numMap[i]=i
                    numMap[j]=j
                else: 
                    []
        print(list(numMap.values()))
        for val in list(numMap.values()):
            return nums[val] + nums[val+1] == target

if __name__ == '__main__':
    sol = Solution()
    test_obj = {
        "testcase1": {
            "nums": [3,2,4],
            "tar": 6
        },
        "testcase2": {
            "nums": [2,7,9,11],
            "tar": 9
        },
         "testcase3": {
            "nums": [2,7,9,11],
            "tar": 20
        },
         "testcase4": {
            "nums": [2,9,11],
            "tar": 9
        },
    }
    for testcase in test_obj:
        if sol.twoSum(test_obj[testcase]["nums"], test_obj[testcase]["tar"]):
            print("Test case passed")
        else:
            print("Test case failed")