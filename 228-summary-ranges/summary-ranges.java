class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();

        if(nums.length==0) return ans;

        int start=0;
        int end=1;

        while(end<nums.length)
        {
            if(nums[end]==1+nums[end-1])
            {
                end++;
            }
            else
            {
                if(end-1==start)
                {
                    ans.add(nums[start]+"");
                    start=end;
                    end++;
                }
                else
                {
                    StringBuilder sb=new StringBuilder();
                    sb.append(nums[start]+"");
                    sb.append("->");
                    sb.append(nums[end-1]+"");
                    ans.add(sb.toString());

                    start=end;
                    end++;
                }
            }
        }

        if(end-1==start || start==end)
        {
            ans.add(nums[start]+"");
        }
        else
        {
            StringBuilder sb=new StringBuilder();
            sb.append(nums[start]+"");
            sb.append("->");
            sb.append(nums[end-1]+"");
            ans.add(sb.toString());

            start=end;
        }
        return ans;
        
    }
}