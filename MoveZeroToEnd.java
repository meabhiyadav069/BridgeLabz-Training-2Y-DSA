
import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {3,0,7,1,0,5,4,0,0,43,12,342};
        int i =0;
        int j = 0;
        while(i <arr.length && j < arr.length){
            if(arr[i] == 0){
                i++;
                continue;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
