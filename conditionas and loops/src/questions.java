import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
// largest number
        int a =input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();

        int max =a;

        if(b>max){
            max=b;
        }if(c>max){
            max=c;
        }

        System.out.println(max);


        int d=input.nextInt();
        int e=input.nextInt();
        int f=input.nextInt();



        int maxi= Math.max(f,Math.max(d,e));
        System.out.println(maxi);

    }
}
