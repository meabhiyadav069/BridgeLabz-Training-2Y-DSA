public class Set_MAtrix_zero {
    public static void main(String[] args) {
        int[][] arr= {
            {1,2,3},
            {4,0,6},
            {7,8,9}
        };
        boolean[] row = new boolean[arr.length];
        boolean[] col = new boolean[arr[0].length];

        for(int i =0 ;i <arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i =0 ;i <arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(row[i] || col[j]){
                    arr[i][j] = 0;
                }
            }
        }

        for(int i =0 ;i <arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
