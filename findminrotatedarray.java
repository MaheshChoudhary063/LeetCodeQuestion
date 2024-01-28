class Solution {
    public int findMin(int[] nums) {
        int st = 0 ;
        int end = nums.length -1;
        while(st<end){
            int m =st+(end-st)/2;
            if(nums[m]>nums[end]) 
            {st=m+1;}
            else end=m;
        }
        return nums[st];
    }

}