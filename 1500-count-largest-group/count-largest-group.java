class Solution {
    public int getSumOfDigits(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum+=(num%10);
            num=num/10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=1;i<=n;i++)
        {
            int sum=getSumOfDigits(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        // System.out.println(map);

        int max=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            max=Math.max(max,e.getValue());
        }

        int count=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()==max)
             count++;
        }

        return count;
    }
}