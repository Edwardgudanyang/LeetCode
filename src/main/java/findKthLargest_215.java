package main.java;

public class findKthLargest_215 {
    public int findKthLargest(int[] nums, int k) {
        int len=nums.length;
        int right=len-1;
        int left=0;
        int target=len-k;

        while(true){
            int index=partition(nums,left,right);
            if(index==target){
                return nums[index];
            }else if(index<target){
                left=index+1;
            }else{
                right=index-1;
            }
        }


    }

    private int partition(int[] nums, int left, int right) {
        int mid=nums[left];
        int j= left;
        for(int i=left+1;i<=right;i++){
            if(nums[i]<mid){
                j++;
                swap(nums,j,i);
            }
        }
        swap(nums,j,left);
        return j;
    }

    private void swap(int[] nums, int j, int i) {
        int t=nums[j];
        nums[j]=nums[i];
        nums[i]=t;
    }

}
