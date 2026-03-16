public class index_finding {
    public static void main(String[] args) {
        int arr[] = {5,4,9,3,1,11};
        int target = 3;
        int ans = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target){
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
