public class transpose_reversed {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int arr2[][] = new int[arr.length][arr[0].length] ;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j<arr[0].length; j++){
                arr2[i][j] = arr[arr[0].length-1-j][arr.length-1-i];
            }
        }

        for(int i = arr.length-1; i >= 0; i--){
            for(int j = 0 ; j<arr[0].length; j++){
                System.out.print(arr2[i][j] + " " );
            }
           System.out.println();
        }
    }
}
