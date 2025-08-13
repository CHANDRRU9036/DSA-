package properties_oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape= new shapes(); 
        circle circle= new circle();
        Square square = new Square(); 

        shape.area();
        circle.area();
        square.area();
    }
    
}
