package FacadeDP;

/**
 * Created by michal on 05.05.16.
 */
public class PrivilegeChecker {

    private boolean isAdmin;
    private boolean isLoggedIn;

    public PrivilegeChecker(boolean isAdmin, boolean isLoggedIn) {
        this.isAdmin = isAdmin;
        this.isLoggedIn = isLoggedIn;
    }

    public boolean adminFeatures() {
        if (!isLoggedIn) {
            System.out.println("You are not logged in!");
            return false;
        } else if (!isAdmin) {
            System.out.println("You do not have admin privilages");
            return false;
        } else return true;
    }
}
