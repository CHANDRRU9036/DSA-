import java.util.Scanner;
public class arguments {

    public static void main(String[] args) {
//        int ans = sum(30,500);
//        System.out.println(ans);
//
//    }
//    static int sum(int a,int b){
//    int sumans= a+b;
//    return sumans;



        Scanner in = new Scanner(System.in);
        System.out.println("enter the sentence");
        String name=in.next();
        String greeting = mygreet(name);
        System.out.println(greeting);

    }

    static String mygreet(String alpha) {
        String message="hello " + alpha;
        return message;



    }


}
