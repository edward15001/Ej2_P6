package fds_p6_patrones_creacionales_ej2;

import java.util.HashMap;
import java.util.Map;

public class LoginSystem {

    private static LoginSystem instance;
    private Map<String, User> users;

    private LoginSystem() {
        users = new HashMap<>();
    }

    public static LoginSystem getInstance() {
        if (instance == null) {
            instance = new LoginSystem();
        }
        return instance;
    }

    public void register(User user) {
        users.put(user.getName(), user);
    }

    public boolean login(String name, String password) {
        if (users.containsKey(name)) {
            User user = users.get(name);
            return user.getPassword().equals(password);
        }
        return false;
    }

    public void welcome(User user) {
        System.out.println("Welcome, " + user.getName() + "!");
    }
}
