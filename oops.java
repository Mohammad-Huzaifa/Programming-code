/**
 * oops
 */

// class Pen {
//     String color;
//     String type;

//     public void write(){
//         System.out.println("Write something");
//     }

//     public void printColor(){
//         System.out.println(this.color);
//         System.out.println(this.type);
//     }
// }

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Non-parameter constructor
    Student(){
        System.out.println("Non parameter constructor called");
    }

    // Parameter constructor
    Student(String naam, int umar){
         System.out.println("Parameter constructor called");
       this.name= naam;
       this.age= umar;
    }

    // Copy constructor
    Student (Student s2){
        System.out.println("Copy constructor is called");
        this.name=s2.name;
        this.age= s2.age;
    }
}

public class oops {
public static void main(String[] args) {
    Student std1= new Student();
    std1.name= "Huzaifa";
    std1.age= 26;
    std1.printInfo();

    Student std2= new Student();
    std2.name= "Mohammad";
    std2.age= 25;
    std2.printInfo();
 
    Student std = new Student("Maaz", 7);
    std.printInfo();

    Student s2= new Student (std1);
    s2.printInfo();
}
    
}