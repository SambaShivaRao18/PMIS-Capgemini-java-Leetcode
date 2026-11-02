class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int target=0;
        if(nums.length%2==0)
            target=(nums[nums.length/2]+nums[(nums.length/2)-1])/2;
        else
            target=nums[nums.length/2];
        
        // System.out.println(target);
        
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<target)
                ans+=(target-nums[i]);
            else if(nums[i]>target)
                ans+=(nums[i]-target);
        }

        return ans;
    }
}