public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,2,-2,1,-3};
        // int arr[] = {-2,1};


        int curSum = arr[0];
        int maxSum = arr[0];

        // for(int i = 0; i < arr.length; i++){
        //     curSum += arr[i];
        //     if(curSum < 0){
        //         curSum = 0;
        //     }
        //     maxSum = Math.max(maxSum, curSum);
        // }

        for(int i =1; i < arr.length; i++){
            curSum = Math.max(arr[i], curSum +arr[i]);
            maxSum = Math.max(maxSum, curSum);
        }

        System.out.println(maxSum);
    }
}
