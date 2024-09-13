interface Shape {
    String getColor();
    
    default String getDescription() {
        return "This is a shape of type: " + getClass().getSimpleName();
    }
}

class Circle implements Shape {
    private double radius;
    private String color;
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius() {
        return radius;
    }
    
    @Override
    public String getColor() {
        return color;
    }
    
    @Override
    public String getDescription() {
        return "This is a circle with radius " + radius + " and color " + color;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;
    
    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    @Override
    public String getColor() {
        return color;
    }
    
    @Override
    public String getDescription() {
        return "This is a rectangle with length " + length + ", width " + width + " and color " + color;
    }
}

class Sign {
    private Shape shape;
    private String text;
    
    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }
    
    public void displaySign() {
        System.out.println(shape.getDescription());
        System.out.println("Sign Text: " + text);
    }
}

public class part4_23 {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red");
        Shape rectangle = new Rectangle(4, 6, "Blue");
        
        Sign circleSign = new Sign(circle, "Welcome to the CHARUSAT Campus");
        Sign rectangleSign = new Sign(rectangle, "Meeting Room");

        circleSign.displaySign();
        rectangleSign.displaySign();
    }
}
