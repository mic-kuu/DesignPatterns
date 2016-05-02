package CommandDP;

/**
 * Main Class for Command Design Pattern
 */
public class MainCommand {

    public static void main (String[] args){
        GeometricFigure figure = SquareOperator.getFigure(2);

        //Controls for Square
        DrawFigureCommand drawCommand = new DrawFigureCommand(figure);
        CommandController drawController = new CommandController(drawCommand);

        DrawFigureCommand enlargeCommand = new DrawFigureCommand(figure);
        CommandController enlargeController = new CommandController(enlargeCommand);

        drawController.press();
        enlargeController.press();
        drawController.press();
        enlargeController.pressUndo();
        drawController.press();

    }






}
