class Rectangle {

    int length = 10;
    int breadth = 5;

    void calculate() {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(); // object creation
        obj.calculate();                 // method call using object
    }
}
