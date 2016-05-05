package FacadeDP;

/**
 * Created by michal on 05.05.16.
 */
public class UserManipulationFacade {

    private AuthenticateUser authenticateUser;
    private UserCreator userCreator;
    private PrivilegeChecker privilegeChecker;

    private boolean isLoggedIn;
    private boolean isAdmin;

    public UserManipulationFacade(String username, String password) {
        userCreator = new UserCreator();

        authenticateUser = new AuthenticateUser(username, password);
        isLoggedIn = authenticateUser.authenticate();
        isAdmin = authenticateUser.isAdmin();

        privilegeChecker = new PrivilegeChecker(isAdmin, isLoggedIn);

    }

    public void createUser() {
        if (privilegeChecker.adminFeatures()){
            userCreator.createUser();
        }
    }
}
