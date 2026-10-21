class Solution {
    public int findPoisonedDuration(int[] nums, int duration) {
        int maxi=-1;
        int ans=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>maxi)
            {
                ans+=duration;
                maxi=Math.max(maxi,nums[i]+duration-1);
            }
            else
            {
                ans+=((nums[i]+duration-1)-maxi);
                maxi=Math.max(maxi,nums[i]+duration-1);
            }
        }

        return ans;
    }
}