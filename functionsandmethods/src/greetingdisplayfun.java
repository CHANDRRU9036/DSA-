import java.util.Scanner;
public class greetingdisplayfun {
    public static void main(String[] args) {
        greetings();
    }
    static void greetings(){
        Scanner display=new Scanner(System.in);
        String word= display.next();
        System.out.println(word);

    }
}

