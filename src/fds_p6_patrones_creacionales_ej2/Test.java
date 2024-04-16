/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fds_p6_patrones_creacionales_ej2;

import java.util.Scanner;

/**
 *
 * @author edwar
 */
public class Test {

    public static void main(String[] args) {
        LoginSystem loginSystem = LoginSystem.getInstance();
        // Nombre usuario
        System.out.println("Introduce tu nombre");
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        
        // Contraseña usuario
        System.out.println("Introduce tu contrasenia");
        String contrasenia = scan.nextLine();
        
        
        // Register a user
        User user = new User("Angel", "password");
        loginSystem.register(user);

        // Try to log in
        if (loginSystem.login(nombre, contrasenia)) {
            loginSystem.welcome(user);
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
