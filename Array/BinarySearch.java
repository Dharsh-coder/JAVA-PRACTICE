package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        
        int low=0;
        int high=nums.length-1;
        int mid;
        System.out.println("hi");
        while(low<=high){
            mid = (low+(high-low))/2;
            if(target==nums[mid]){
                System.out.println(mid);
                break;
                
            }else if (target<nums[mid]){
                high = mid-1;
                
            }else{
                low = mid+1;
            }
            
               
        }
        
    }
}
