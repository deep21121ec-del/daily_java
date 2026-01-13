import java.util.Arrays;

public class RowColSortedMatric {
    static void main(String[] args) {
        int[][] mat = {
                {2, 8, 10, 12},
                {18, 21, 28, 31},
                {40, 46, 47, 51},
                {53, 55, 60, 64}
        };
        int target = 47;
        int[] res = findRowCol(mat, target);
        System.out.println(Arrays.toString(res));

    }

    static int[] findRowCol(int[][] mat, int target){
        int row = 0;
        int col = mat[0].length - 1;
        while(row < mat.length  && col >=0){
            if(mat[row][col]==target){
                return new int[]{row+1,col+1};
            }
            if(mat[row][col]>target){
                col--;
            }
            else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
