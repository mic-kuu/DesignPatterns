package FacadeDP;

import java.util.HashMap;

/**
 * Created by michal on 05.05.16.
 */
public class AuthenticateUser {

    static private HashMap<String, String> userDB = new HashMap<>();

    static {
        userDB.put("admin", "strongpassword");
    }

    private String providedUsername;
    private String providedPassword;

    public AuthenticateUser(String username, String password) {
        providedUsername = username;
        providedPassword = password;

    }

    public boolean authenticate(){
        String databasePassword = userDB.get(providedUsername);

        if (databasePassword == providedPassword) {
            return true;
        } else return false;
    }

    public boolean isAdmin(){
        if (providedUsername.equals("admin")) {
            return true;
        } else return false;
    }
}
