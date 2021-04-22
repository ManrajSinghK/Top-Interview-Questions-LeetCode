class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() == t.length())
        {
        char[] st = s.toCharArray();
        Arrays.sort(st);
        char[] st2=t.toCharArray();
        Arrays.sort(st2);
        
        for(int i=0;i<st.length;i++)
        {
            if(st[i] != st2[i])
                return false;
        }
        return true;
        }
        else
        {
            return false;
        }
        
    }
}
