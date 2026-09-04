class Solution {
    public int search(int[] num, int target) {
        int n = num.length;
        int start = 0; 
        int end = n-1;
        while( start <= end) {
            int mid = (start + end)/2;
            if(num[mid]== target) {
                return mid;
            }

            if(num[start]<=num[mid]){
                if(num[start] <= target && num[mid] > target)
                    end = mid-1;
                else
                    start = mid +1;
                
            }
            else{
                 if(num[mid] < target && target <= num[end])
                    start = mid +1;
                 else 
                    end = mid-1;
            }
        }
        return -1;
    }
}