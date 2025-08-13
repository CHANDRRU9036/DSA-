import java.util.Scanner;

public class factorials{
    public static void main(String[] args) {
        int number ;
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        number =sc.nextInt();
        int answer=factorial(number);
        System.out.println(answer);


        
    }

    static int factorial(int n ){
        if(n==1)
            return 1 ;

        return n* factorial(n-1);    


        
    }


}