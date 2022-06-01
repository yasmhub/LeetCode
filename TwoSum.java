public class TwoSum {
    
    /*
    Given an array of integers nums and an integer target, 
    return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, 
    and you may not use the same element twice.
    */
    public static void main(String[] args) 
    {
        //int[] nums = new int[] {2,7,11,15};
        int[] nums = new int[] {3,2,4};
        int target = 6;
        int[] out = MyTwoSum(nums, target);
        System.out.println(out[0] + ", " + out[1]);
    }

    public static int[] MyTwoSum(int[] nums, int target) 
    {
        int[] output = new int[2];
        for(int i = 0; i < nums.length; ++i) 
        {        
            int a = nums[i];
            int b = i;
            
            for(int k = 0; k < nums.length; ++k) 
            {
                if((a + nums[k]) == target) 
                {
                    output[0] = k;
                    output[1] = b;
                }
            }
        }
        return output;
    }
    /*
        public int[] TwoSum(int[] nums, int target) {
        int[] answer = new int[2];
        
        for(int i = nums.Length-1; i >= 0; --i) {
            int g = i;
            Console.WriteLine(i);
            Console.WriteLine(g);
        }



        for(int i = nums.Length-1; i >= 0; --i) {
            
            int a = nums[i];
            int inA = i;
            
            for(int k = nums.Length-1; i >= 0; --i) {
                Console.WriteLine(k);
                if((a + nums[k]) == target) {
                    answer[0] = inA;
                    answer[1] = k;
                    return answer;
                }
            }
        }
        return answer;
    }
    */
}
