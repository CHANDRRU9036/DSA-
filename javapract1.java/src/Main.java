import java.util.Scanner;
public class Main {
    public static  void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int[] rollnumbers = new int[5];


        System.out.println(rollnumbers[2]);



        // input using for loops
        for(int i=0; i<rollnumbers.length;i++) {
            rollnumbers[i] = in.nextInt();
        }


        for(int i =0; i <rollnumbers.length; i++){
            System.out.println(rollnumbers[i]);
        }



        }






    }

