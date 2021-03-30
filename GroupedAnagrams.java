class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        
        
        List<List<String>> groupedAnagrams=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String current: strs)
        {
            char[] arr=current.toCharArray();
            Arrays.sort(arr);
            
            String sorted=new String(arr);
            if(!map.containsKey(sorted))
            {
                map.put(sorted,new ArrayList());
            }
            
            map.get(sorted).add(current);
        }
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
        
        
        
    }
}
