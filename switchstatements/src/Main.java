//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit =in.next();

//        if(fruit.equals("mango")){
//            System.out.println("king of fruit");
//        }
//
//        if(fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }
        //instead we can use switch code
//        switch (fruit) {
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("a sweet red fruit");
//                break;
//            case "orange":
//                System.out.println("big fruit ");
//                break;
//            case "grapes":
//                System.out.println("small fruit");
//                break;
//            default:
//                System.out.println("enter a valid fruit ");
//                break;

        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("a sweet red fruit");
            case "orange" -> System.out.println("big fruit ");
            case "grapes" -> System.out.println("small fruit");
            default -> System.out.println("enter a valid fruit ");
        }


    }
}
