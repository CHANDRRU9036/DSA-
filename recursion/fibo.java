// 0 1 1 2 3 5 8 13 21 34 55 89 144........
import java.util.Scanner;
class fibo
{

     
     public static void main(String [] args)
	 {
		Scanner kbd = new Scanner ( System.in );
		int term = kbd.nextInt();
		int fibo_term = fibonachi ( term );
		System.out.printf("%dth of FIBO = %d\n", term, fibo_term);
	 }

	 static int fibonachi(int n ){
		if (n<2){
			return n;
		}
		return fibonachi(n-1)+fibonachi(n-2);

	 }
}


