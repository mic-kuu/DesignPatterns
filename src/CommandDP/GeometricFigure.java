package CommandDP;

/**
 * General interafce that specifies basic operations
 * on a geometric figure
 */
public interface GeometricFigure {

    double calculateArea();
    void enlarge();
    void shrink();
    void draw();
    void destroy();


}
