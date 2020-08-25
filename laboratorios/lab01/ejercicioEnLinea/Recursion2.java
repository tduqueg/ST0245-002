public class Recursion2 {


    public boolean groupSum(int start, int[] nums, int target) {
        if(start == nums.length) return target == 0; // C1
        else return (groupSum(start + 1, nums, target - nums[start]) || // C2*T(n - 1)
                groupSum(start + 1, nums, target)); // C2*T(n - 1)
    }

    // Recursion2 - groupNoAdj
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if(start >= nums.length) return target == 0; // C1
        else return (groupNoAdj(start + 2, nums, target - nums[start]) || // C3*T(n - 2)
                groupNoAdj(start + 1, nums, target)); // C4*T(n - 1)
    }
    // Recursion2  groupSum5
    public boolean groupSum5(int start, int[] nums, int target) {
        if(start == nums.length){ // C1
            return target == 0;
        }
        if(nums[start] % 5 == 0 && start + 1 < nums.length && nums[start + 1] == 1)
            return groupSum5(start + 2, nums, target - nums[start]); // C2*T(n - 2)
        if(nums[start] % 5 == 0) return  groupSum5(start + 1, nums, target - nums[start]); // C3*T(n - 1)
        else return (groupSum5(start +1, nums, target -nums[start]) || // C4*T(n - 1)
                groupSum5(start +1, nums, target)); // C5*T(n - 1)
    }
    // Recursion2 - splitArray
    public boolean splitArray(int[] nums) {
        return splitArrayHelper(0, 0, 0, nums);
    }
    public boolean splitArrayHelper(int start, int sum1, int sum2, int[] nums){
        if(start == nums.length) return sum1 == sum2; // C1
        else{
            return (splitArrayHelper(start + 1, sum1 + nums[start], sum2, nums) || // C2*T(n -1)
                    splitArrayHelper(start + 1, sum1, sum2 + nums[start], nums)); // C3*T(n -1)
        }
    }
    // Recursion2 - groupSumClump
    public boolean groupSumClump(int start, int[] nums, int target) {
        if(start == nums.length) return target == 0; // C1
        if(start + 1 < nums.length && nums[start] == nums[start + 1] && nums[start] != nums[start - 1]){
            int j = 0;
            for(int i = 0; i + start < nums.length; i++){
                if(start + i + 1 < nums.length && nums[start + i] == nums[start + i + 1]){ // C2*m
                    j++;
                }
            }
            return (groupSumClump(start + j + 1, nums, target - nums[start]*(j + 1)) || // C3*T(n - m)
                    groupSumClump(start + j + 1, nums, target)); // C4*T(n - m)
        }else if(start >= 1 && nums[start] == nums[start - 1]) return groupSumClump(start + 1, nums, target); // C5*T(n - 1)
        else return (groupSumClump(start + 1, nums, target - nums[start]) || // C6*T(n - 1)
                    groupSumClump(start + 1, nums, target)); // C7*T(n - 1)
    }

    // Recursion2 - groupSum6
    public boolean groupSum6(int start, int[] nums, int target) {
        if(start == nums.length) return target == 0; // C1
        else{
            if(nums[start] == 6) return groupSum6(start + 1, nums, target - nums[start]); // C2*T(n - 1)
            else return (groupSum6(start + 1, nums, target - nums[start]) || // C3*T(n - 1)
                    groupSum6(start + 1, nums, target)); // C3*T(n - 1)
        }
    }
}

