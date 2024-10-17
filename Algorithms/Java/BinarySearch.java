class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]>target){
                high = mid -1;
            }

            else{
                low = mid+1;
            }


        }

        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1,2,4,5,7};
        int target = 5;

        System.out.println("Index of target element is " + ": " + sol.search(nums, target));
    }
}
