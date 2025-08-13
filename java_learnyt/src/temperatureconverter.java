
import java.util.Scanner;
public class temperatureconverter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float tempc =input.nextFloat();
        float tempf=(tempc* 9/5)+32;
        System.out.println("temprature in f is "+tempf);

    }

}
