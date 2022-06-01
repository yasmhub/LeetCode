import java.util.Random;
/*
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

1 <= nums.length <= 1000 : nums.len at least 1, less than 1001
-10^6 <= nums[i] <= 10^6 : nums range -1...1 million
*/

public class RunningSum1D {

    public static void main(String[] args) 
    {
        Random rand = new Random();
        int size = rand.nextInt(1000) + 1; //0...999 + 1

        int[] input = new int[size];
        for(int i = input.length-1; i >= 0; --i) 
        {
            input[i] = -1000000 + rand.nextInt(2000001); // -10^6...10^6
        }
        input = new int[] {1, 1, 1, 1, 1};

        int[] output = runningSum(input);
        for(int i = 0; i < output.length; ++i)
        {
            System.out.print(output[i] + ",");
        }
    }

    public static int[] runningSum(int[] nums) 
    {
        int length = nums.length;
        int sum = 0;

        for(int i = 0; i < length; ++i)
        {
            int n = i;
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
