class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==0)
            {
                i=j;
                break;
            }
        }

        int j=i;
        for(int k=i;k<nums.length;k++)
        {
            if(nums[k]!=0)
            {
                j=k;
                break;
            }
        }

        while(i<nums.length && j<nums.length)
        {
           while(i<nums.length && nums[i]!=0)
            i++;

            while(j<nums.length && nums[j]==0)
                j++;
            
            if(i<nums.length && j<nums.length && i<j)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
    }
}