import java.util.Scanner;
public class pract {
    public static void main(String[] args) {
        String greetings= mygreetings();
        System.out.println(greetings);
    }

    static String mygreetings() {
        Scanner dcan = new Scanner(System.in);
        String string=dcan.next();
        return string;


    }

}
