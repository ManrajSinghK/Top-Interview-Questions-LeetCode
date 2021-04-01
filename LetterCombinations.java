class Solution {
    public List<String> letterCombinations(String digits) 
    {
        LinkedList<String> out=new LinkedList();
        
        if(digits.length() == 0)
            return out;
        
        out.add("");
        String[] char_map=new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        for(int i=0;i<digits.length();i++)
        {
            int index=Character.getNumericValue(digits.charAt(i));
            while(out.peek().length() == i)
            {
                String permutation=out.remove();
                for(char c:char_map[index].toCharArray())
                {
                    out.add(permutation+c);   
                }
            }
        }
        return out;       
    }
}
