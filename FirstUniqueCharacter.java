class Solution {
    public int firstUniqChar(String s) 
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char current = s.charAt(i);
            if(!hm.containsKey(current))
            {
                hm.put(current, i);
            }
            else
            {
                hm.put(current,-1);
            }
        } 
        int min = Integer.MAX_VALUE;
        for(char c : hm.keySet())
        {
            if(hm.get(c) > -1 && hm.get(c)<min)
            {
                min=hm.get(c);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
