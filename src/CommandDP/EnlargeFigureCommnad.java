package CommandDP;

/**
 * Created by michal on 02.05.16.
 */
public class EnlargeFigureCommnad implements Command {

    private  GeometricFigure figure;

    public EnlargeFigureCommnad(GeometricFigure figure) {
        this.figure = figure;
    }

    @Override
    public void execute() {
        figure.enlarge();
    }

    @Override
    public void undo() {
        figure.shrink();
    }
}
