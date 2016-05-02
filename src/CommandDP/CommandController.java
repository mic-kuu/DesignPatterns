package CommandDP;

/**
 * Created by michal on 02.05.16.
 */
public class CommandController {

    private Command command;

    public CommandController(Command command) {
        this.command = command;
    }

    public void press(){
        command.execute();
    }

    public void pressUndo(){
        command.undo();
    }
}
