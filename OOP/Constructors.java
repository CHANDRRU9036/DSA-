// In object-oriented programming, a constructor is a special method used to initialize an object when it's created
public class Constructors {

    public static void main(String[] args) {
        Student chandu = new Student(15, "chandu", 40.0f, 90);
        Student rahul = new Student();

        rahul.changename("shoe lover");
        rahul.greeting();

        System.out.println(chandu.rno);
        System.out.println(chandu.name);
        System.out.println(chandu.marks);
        System.out.println(chandu.attendance);

        Student random = new Student(chandu);
        
        System.out.println(random.name);
    }
}



class Student {
    float marks;
    int attendance;
    String name;
    int rno;

    void greeting() {
        System.out.println("Good morning, my name is " + name);
    }

    void changename(String newName) {
        this.name = newName;
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
        this.attendance = other.attendance; 
    }

    // Default constructor
    public Student() {
        this.name = "chandrru";
        this.rno = 1;
        this.attendance = 100;
        this.marks = 90.0f;
    }

    // Parameterized constructor
    public Student(int rollNum, String Name, float marks, int Attendance) {
        this.name = Name;
        this.rno = rollNum;
        this.attendance = Attendance;
        this.marks = marks;
    }
}



