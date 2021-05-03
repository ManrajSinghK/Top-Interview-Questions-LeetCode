class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return new int [] {-1, -1};
        int first = findFirst (nums, target);
        int last = findLast (nums, target);
        return new int [] {first, last};
    }
    
    public int findFirst (int arr [], int target) {
        int left = 0, right = arr.length - 1, mid = 0, res = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr [mid] == target) {
                res = mid;                 
                right = mid - 1;        
            }
            else if (target > arr [mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return res;
    }
    
    public int findLast (int arr [], int target) {
        int left = 0, right = arr.length - 1, mid = 0, res = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr [mid] == target) {
               res = mid;                 
               left = mid + 1;            
            }
            else if (target > arr [mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return res;
    }
}
