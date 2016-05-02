package CommandDP;

/**
 * A Square implementation
 */
public class Square implements GeometricFigure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public void enlarge() {
        side = side*2;
    }

    @Override
    public void shrink() {
        side = side * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a sqare, of area: " + calculateArea());
    }

    @Override
    public void destroy() {
        System.out.println("Destroying a square of area: " + calculateArea());
    }
}