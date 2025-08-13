import java.util.Arrays;

public class searchin2darray {
    public static void main(String[] args) {
        int[][] arres={
            {1,2,3},
            {4,5,6,89},
            {7,8,9,54},
            {34,24}
        };

        int target=89;
        int[]ans=search(arres,target);
        System.out.println(Arrays.toString(ans));
    }

    static  int[] search(int[][]arr,int target){
        for(int row =0; row<arr.length; row++   ){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }

            }
        }
         return new int[]{-1,-1};


    }




    
}
