import java.util.Scanner;
public class pract {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] srjc = new int [3];

        for(int i =0; i<srjc.length; i++){
            srjc[i]=in.nextInt();
        }

        for( int j : srjc){
            System.out.println(j);
        }
    }
}




