abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("Shape Info");
    }
}

class Circle extends Shape {
    void calculate_area() {
        System.out.println("Area of Circle");
    }
}

class Rect extends Shape {
    void calculate_area() {
        System.out.println("Area of Rectangle");
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.calculate_area();
        s.display_info();
    }
}