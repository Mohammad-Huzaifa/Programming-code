abstract class Animals {
     public void walks(){

     }
}

class Horse extends Animals {
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}


class Chicken extends Animals{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Chicken chick = new Chicken ();
        chick.walk();
        System.out.println("New Animals");
        Horse horse = new Horse();
        horse.walk();
    }
}
