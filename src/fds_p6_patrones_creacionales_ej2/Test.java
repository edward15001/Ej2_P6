/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fds_p6_patrones_creacionales_ej2;

/**
 *
 * @author edwar
 */
public class Test {

    public static void main(String[] args) {
        LoginSystem loginSystem = LoginSystem.getInstance();

        // Register a user
        User user = new User("John Doe", "password123");
        loginSystem.register(user);

        // Try to log in
        if (loginSystem.login("John Doe", "password123")) {
            loginSystem.welcome(user);
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
