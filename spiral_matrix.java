public class spiral_matrix {
    public static void main(String[] args) {
        //  int arr[][] = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};
        int[][] arr = { {1, 2, 3, 4, 5} };


         int start_row = 0;
         int end_row = arr.length-1;
         int start_col = 0;
         int end_col = arr[0].length-1;

         while(start_col <= end_col && start_row <= end_row){

            for(int i = start_col; i<=end_col; i++){
                System.out.print(arr[start_row][i] + " ");
                
            }
            start_row++;

            for(int i = start_row; i<=end_row; i++){
                System.out.print(arr[i][end_col]+ " ");
                
            }
            end_col--;

            if(start_col <= end_col){
            for(int i = end_col; i >=start_col; i--){
                
                System.out.print(arr[end_row][i] + " ");
                
            }
            end_row--;
        }
            
        if(end_row >= start_row){
            for(int i = end_row; i >=start_row; i--){
                
                System.out.print(arr[i][start_col] + " ");
                
            }
            start_col++;
         }
        }
    }
}
