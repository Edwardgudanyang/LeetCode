package main.java;

public class runningSum1480 {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return nums;
        }
        for(int i=1;i<n;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
