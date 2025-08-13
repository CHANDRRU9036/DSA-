
import java.util.Scanner;
public class nestedswitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int empid= in.nextInt();

        String department = in.next();

        switch(empid){
            case 1:
                System.out.println("kunal");
                break;
            case 2:
                System.out.println("rahul");
                break;

            case 3:
                 switch(department){
                     case "IT":
                         System.out.println("it department ");
                         break;
                     case "Management":
                         System.out.println("managermnrt department ");
                         break;

                     default:
                         System.out.println("no deapertment ");


                 }


            default:
                System.out.println("enter correct id");


        }

    }
}


