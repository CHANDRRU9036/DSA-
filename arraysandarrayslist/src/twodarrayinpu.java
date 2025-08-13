import java.util.Arrays;
import java.util.Scanner;
public class twodarrayinpu {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] array2 = new int[3][2];

        for (int row = 0; row < array2.length; row++) {
            for (int col = 0; col < array2[row].length; col++) {
                array2[row][col] = in.nextInt();
            }
//        }
//        for (int row = 0; row < array2.length; row++) {
//            for (int col = 0; col < array2[row].length; col++) {
//                System.out.print(array2[row][col]+ "  ");
//             
//            }
//            System.out.println();
          
//            tostring method 
            for (int i= 0;i < array2.length ; i++) {
                System.out.println(Arrays.toString(array2[i]));

            }
            


        }


    }

}