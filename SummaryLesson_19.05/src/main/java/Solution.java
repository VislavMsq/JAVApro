public class Solution {


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solve(new int[] {1, 7, 8, 10, 12, 17}));
    }


    /*
    Найти наибольшую сумму подряд идущих элементов в массиве.
    input:  [1, 3, 4, 5, 7, 8, 10, 12]
    output: 15
    explanation: 7 + 8 = 15

    input:  [1, 7, 8, 10, 12, 17]
    output: 17
    explanation: 17 = 17
     */


    public int solve(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxSum = nums[0];
        int curSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 == nums[i]) {
                curSum += nums[i];
            } else {
                if (curSum > maxSum) {
                    maxSum = curSum;
                }
                curSum = nums[i];
            }
        }
        if (curSum > maxSum) {
            maxSum = curSum;
        }
        return maxSum;
    }
}