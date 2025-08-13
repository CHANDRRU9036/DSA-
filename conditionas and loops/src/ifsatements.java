import java.util.Scanner;

public class ifsatements {

        public static void main(String[] args) {
        /*
        syntax of if statements
        if(boolean expression t or f){
             ??body
        } else{
           //do this
        }
        */
            Scanner input=new Scanner(System.in);
           int salary=input.nextInt();
//            if(salary<30000){
//                salary=salary+40000;
//            } else{
//                salary=salary +20000;
//            }

            if(salary>10000) {
                salary += 2000;
            }else if(salary>30000){
                salary+=80000;

            }else{
                salary+=800000;
            }

            System.out.println(salary);

        }
    }
