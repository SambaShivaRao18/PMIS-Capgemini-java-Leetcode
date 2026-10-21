class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();

        for(String mail:emails)
        {
            StringBuilder sb=new StringBuilder();
            boolean isPlus=false;
            boolean isAt=false;
            for(int i=0;i<mail.length();i++)
            {
                if(mail.charAt(i)=='+')
                {
                    isPlus=true;
                }
                else if(mail.charAt(i)=='@')
                {
                    isAt=true;
                    sb.append(mail.substring(i,mail.length()));
                    break;
                }
                else if(mail.charAt(i)=='.')
                {
                    continue;
                }
                else if(!isPlus)
                {
                    sb.append(mail.charAt(i));
                }
            }
            System.out.println(sb.toString());
            set.add(sb.toString());
        }

        return set.size();
    }
}