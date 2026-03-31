class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle = 3.14*r*r");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle = l*b");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}