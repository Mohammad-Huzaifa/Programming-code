class Shape {
    public void areaShape (){
        System.out.println("Displaying area");
    }
}

// single level inheritance
class Triangle extends Shape {
    public void area (int l, int h){
        System.out.println("Display single level inheritance of shape class ");
        System.out.println(l*h);
    }
}

// multi level inheritance
class EquilateralTriangle extends Triangle {
    public void eqarea (int l, int h){
        System.out.println("Display multi level inheritance of triangle class ");
        System.out.println(l*h);
    }
}

// Hierarchial inheritance

class Circle extends Shape{
    public void carea(int r){
        System.out.println((3.16)*r*r);
    }
}


public class inheritance {
    public static void main(String[] args) {
    Triangle t = new Triangle();
    t.areaShape();
    t.area(2, 5);

    EquilateralTriangle eqt = new EquilateralTriangle();
    eqt.area(2,3);
    eqt.eqarea(6,6);

        Circle c = new Circle();
        c.areaShape();
        c.carea(4);
    
    Shape shape = new Shape();
    shape.areaShape();
    }
}
