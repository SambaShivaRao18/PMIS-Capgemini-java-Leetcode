class Solution {
    public int getSumOfDigits(int i)
    {
        int sum=0;
        while(i>0)
        {
            sum+=(i%10);

            i=i/10;
        }

        return sum;
    }
    public int countLargestGroup(int n) 
    {
        //Create HashMap
        HashMap<Integer,Integer> map=new HashMap<>();

        //Interate from 1 to n
        for(int i=1;i<=n;i++)
        {
            int sum=getSumOfDigits(i);

            if(map.isEmpty() || !map.containsKey(sum))
            {
                map.put(sum,1);
            }
            else
            {
                int freq=map.get(sum);
                map.put(sum,freq+1);
            }
        }

        int largest=0;
        //Find largest value in the hashmap
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            largest=Math.max(largest,e.getValue());
        }

        int count=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue()==largest)
             count++;
        }

        return count;
    }
}