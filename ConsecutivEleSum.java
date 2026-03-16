public class ConsecutivEleSum {
    public static void main(String[] args) {
        int k = 4;
        int[] arr = {2,-1,4,8,-2,6,1,9};
        int left = 0;
        int right = k-1;
        int mean = 0;
        int MaxMean = 0;

        for(int i  = left; i<= right; i++){
            mean = mean + arr[i];
        }
        MaxMean = mean;
        left++;
        right++;

        while(right < arr.length){
            mean = mean - arr[left-1];
            mean = mean + arr[right];
            MaxMean = Math.max(mean, MaxMean);
            left++;
            right++;
        }
        System.out.println((double)MaxMean/k);
    }
}
