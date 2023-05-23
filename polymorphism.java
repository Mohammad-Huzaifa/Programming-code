class Student{

    // if functions having same name then it should have different return type
    public void printInfo(String name){
        System.out.println(name);
    }

    // or have same function name with same return type but have different parameter
    public void printInfo(int age){
        System.out.println(age);
    }

    // or have same function name with same return type and one parameter is same as above then it should have more than one parameter to avoid error
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}


public class polymorphism {
    public static void main(String[] args) {
        Student std = new Student();
        std.printInfo("Huzaifa");
        std.printInfo(26);
        std.printInfo("Mohammad", 25);
    }
}
