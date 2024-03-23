// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }

        // Create an array to store the maximum amount of money that can be robbed up to the ith house
        int[] dp = new int[nums.length];

        // Initialize the base cases
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // Iterate through the array of house values
        for (int i = 2; i < nums.length; i++) {
            // Calculate the maximum amount of money that can be robbed at the current house
            // by choosing between robbing the current house and not robbing it
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        // Return the maximum amount of money that can be robbed without alerting the police
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        HouseRobber robber = new HouseRobber();

        // Example usage
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println("Maximum amount of money that can be robbed: " + robber.rob(nums)); // Output: 12
    }
}
