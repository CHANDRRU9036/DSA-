import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];





////    input using for loops////// // }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }
        for (int j : arr) {
            System.out.print(j + "  ");
        }

        int[] arrrr= new int[5];

        for (int i=0;i<arrrr.length;i++) {
            arrrr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arrrr));

    }
        }
