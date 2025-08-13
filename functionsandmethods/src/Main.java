//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        sum();
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num1 ");
        int num1 = in.nextInt();
        System.out.println("enter num2 ");
        int num2=in.nextInt();
        int sumt=num1+num2;
        System.out.println("sum of the numbers"+sumt);
    }

}




