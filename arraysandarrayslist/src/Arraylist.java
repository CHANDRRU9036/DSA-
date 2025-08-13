import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
//        list.add(67);
//        list.add(45);
//        list.add(67);
//        list.add(45);
//        list.add(67);
//        list.add(45);
//        list.add(67);
//        list.add(45);
//        list.add(67);
//        list.add(45);
//        list.add(67);
//        list.add(45);
//        list.add(67);
//        list.add(45);
//        list.add(45);
//
//        System.out.println(list);
//
//        System.out.println(list.contains(67));
//
//        list.set(0,99);
//        System.out.println(list);
//        list.remove(2);

// input
        for (int i = 0; i <5; i++) {
            list.add(in.nextInt());
        }
//        get item at any index
        for (int i = 0; i <5 ; i++) {
            System.out.println(list.get(i)); // pass index here


        }
        System.out.println(list);

        }
}



