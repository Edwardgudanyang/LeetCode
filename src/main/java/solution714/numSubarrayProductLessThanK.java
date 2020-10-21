package main.java.solution714;

public class numSubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int count=0;
        int l=0;
        // 记录现在的结果
        int n=1;
        for(int i=0;i<nums.length;i++){
            n*=nums[i];
            while(n>=k){
                n/=nums[l++];
            }
            count+=i-l+1;
        }
        return count;
    }
}
