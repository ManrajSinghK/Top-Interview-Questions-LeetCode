class Solution {
    public int romanToInt(String s) 
    {
        int answer=0;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        for(int i=0;i<s.length();i++)
        {
            if(i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1)))
                answer+= map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1));
            else
                answer+=map.get(s.charAt(i));
        }
        return answer;
    }
}
