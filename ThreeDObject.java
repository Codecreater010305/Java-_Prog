abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double length, width, height;
    Box(double l, double w, double h) { length = l; width = w; height = h; }
    public double wholeSurfaceArea() { return 2*(length*width + width*height + height*length); }
    public double volume() { return length * width * height; }
}

class Cube extends ThreeDObject {
    double side;
    Cube(double s) { side = s; }
    public double wholeSurfaceArea() { return 6 * side * side; }
    public double volume() { return side * side * side; }
}

class Cylinder extends ThreeDObject {
    double radius, height;
    Cylinder(double r, double h) { radius = r; height = h; }
    public double wholeSurfaceArea() { return 2 * Math.PI * radius * (radius + height); }
    public double volume() { return Math.PI * radius * radius * height; }
}

class Cone extends ThreeDObject {
    double radius, height;
    Cone(double r, double h) { radius = r; height = h; }
    public double wholeSurfaceArea() {
        double slant = Math.sqrt(radius*radius + height*height);
        return Math.PI * radius * (radius + slant);
    }
    public double volume() { return (1.0/3) * Math.PI * radius * radius * height; }
}

public class ThreeDObjectDemo {
    public static void main(String[] args) {
        ThreeDObject[] shapes = {
            new Box(3, 4, 5),
            new Cube(4),
            new Cylinder(3, 7),
            new Cone(3, 7)
        };
        for (ThreeDObject s : shapes) {
            System.out.println(s.getClass().getSimpleName() +
                " -> Surface: " + String.format("%.2f", s.wholeSurfaceArea()) +
                ", Volume: " + String.format("%.2f", s.volume()));
        }
    }
}
