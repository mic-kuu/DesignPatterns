package CommandDP;

/**
 * A circle implementation
 */
public class Circle implements GeometricFigure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void shrink() {
        radius = radius * 0.5;
    }

    @Override
    public double calculateArea() {
        return radius*radius*3.14;
    }

    @Override
    public void enlarge() {
        radius = radius * 2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle of radius: " + calculateArea());
    }

    @Override
    public void destroy() {
        System.out.println("Destroying a cricle of radius: " + calculateArea());
    }
}
