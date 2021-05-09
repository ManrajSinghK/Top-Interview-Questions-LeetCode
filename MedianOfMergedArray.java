class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m=nums1.length;
        int n=nums2.length;
        int[] MergedArray=new int[m+n];
        for(int i=0;i<m;i++)
        {
            MergedArray[i]=nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            MergedArray[m++] = nums2[i];
        }
        Arrays.sort(MergedArray);

        if((MergedArray.length) % 2 != 0)
        {
            return MergedArray[MergedArray.length/2];
        }
        else
        {
            int x=MergedArray.length/2;
            double p=MergedArray[x];
            double q=MergedArray[x-1];
            
            return (p+q)/2;
        }
        
    }
}
