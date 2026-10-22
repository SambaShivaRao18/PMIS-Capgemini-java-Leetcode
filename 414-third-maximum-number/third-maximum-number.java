class Solution {
    public int thirdMax(int[] nums) {
        long fstHst=Long.MIN_VALUE;
        long secHst=Long.MIN_VALUE;
        long trdHst=Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            long curNum=(long)nums[i];

            if(curNum==fstHst || curNum==secHst || curNum==trdHst)
             continue;
            
            if(curNum>fstHst)
            {
                trdHst=secHst;
                secHst=fstHst;
                fstHst=curNum;
            }
            else if(curNum>secHst)
            {
                trdHst=secHst;
                secHst=curNum;
            }
            else if(curNum>trdHst)
            {
                trdHst=curNum;
            }
        }

        long ans=(trdHst!=Long.MIN_VALUE)?trdHst:fstHst;

        return (int)ans;
    }
}