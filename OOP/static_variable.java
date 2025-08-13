public class static_variable{
    static int a=4;
    static int b;

    static {
        System.out.println("i am ");
        b=a*5;

    }

    public static void main(String[] args) {
        static_variable obj= new static_variable();
        System.out.println(static_variable.a+" "+static_variable.b);
        
    }

    
}