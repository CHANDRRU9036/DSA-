import java.util.Scanner;

public class returning_diff_fromprinting {
    public static void main(String[] args) {
//        int ans= sum();
//        System.out.println(ans);
//    }
//
//    static int sum() {
//
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter num1 ");
//        int num1 = in.nextInt();
//        System.out.println("enter num2 ");
//        int num2 = in.nextInt();
//        int sumt = num1 + num2;
//        return sumt;

        String ans= greet();
        System.out.println(ans);


    }
   static String greet(){
        Scanner in = new Scanner(System.in);
        String print=in.next();

        return print;


    }
}




