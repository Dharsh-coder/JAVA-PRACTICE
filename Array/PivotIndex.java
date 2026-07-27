package Array;

/**
 * PivotIndex
 */
public class PivotIndex {

    public static void main(String[] args) {
        int[] arr = {2,1,-1};
        int total=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        for(int i=0; i<arr.length;i++){
            int sum=0;
            
            for(int j=0;j<=i;j++){
                sum+=arr[j];    
            }
            if((sum-arr[i]) == total-(sum) ){
                    index=i;
                    break;
                }
        }
        System.out.println(index);
    }
}

