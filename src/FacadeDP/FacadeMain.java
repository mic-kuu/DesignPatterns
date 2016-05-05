package FacadeDP;

/**
 * Main playground for the Facade Design Pattern
 */
public class FacadeMain {

    public static void main (String[] args){
        UserManipulationFacade manipulator;
        manipulator = new UserManipulationFacade("admin", "strongpassword");
        manipulator.createUser();
    }
}
