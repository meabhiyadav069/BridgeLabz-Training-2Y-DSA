import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {4,2,9,6,5,1};

        for(int i = 1; i<arr.length; i++){
            int j = i-1;
            int temp = arr[i];
            while(j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        System.out.println(Arrays.toString(arr));
        
    }
}
