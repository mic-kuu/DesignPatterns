package CommandDP;

/**
 * This is the core of the Command DP. This class represents a command that is decoupled from
 * it's usage in the interface and is not a simple call of an object's class
 */
public class DrawFigureCommand implements Command {

    private GeometricFigure figure;

    public DrawFigureCommand(GeometricFigure figure) {
        this.figure = figure;
    }

    @Override
    public void execute() {
        figure.draw();
    }

    @Override
    public void undo() {
        figure.destroy();
    }
}
