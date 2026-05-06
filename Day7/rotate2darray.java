package Day7;

public class rotate2darray {
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };

        int row = 4;
        int col = 3;

        int[][] nums = new int[col][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                nums[j][row - 1 - i] = arr[i][j];
            }
        }

        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}