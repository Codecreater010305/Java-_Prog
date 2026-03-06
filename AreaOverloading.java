class Area {

    
    void area(int side) {
        int a = side * side;
        System.out.println("Area of Square = " + a);
    }

    
    void area(int length, int breadth) {
        int a = length * breadth;
        System.out.println("Area of Rectangle = " + a);
    }

  
    void area(double radius) {
        double a = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + a);
    }
}

public class MethodOverloadingArea {
    public static void main(String[] args) {
        Area obj = new Area();

        obj.area(5);        
        obj.area(4, 6);     
        obj.area(3.5);      
    }
}
