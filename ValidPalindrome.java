class Solution {
    public boolean isPalindrome(String s) 
    {
        String fix = "";
        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c) || Character.isLetter(c))
            {
            fix += c;
            }
        }
        fix=fix.toLowerCase();
        System.out.println(fix);
        int x=0;
        int y=fix.length() - 1;
        while(x <= y)
        {
            if(fix.charAt(x++) != fix.charAt(y--))
            { return false;}
                 
        }
        return true;
    }
}
