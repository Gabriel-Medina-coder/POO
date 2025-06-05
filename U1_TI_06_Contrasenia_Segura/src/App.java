import javax.swing.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User usuario = new User();

        String userName;
        String password;

        do{
            System.out.println("Ingrese su usuario");
            userName= sc.nextLine();
            usuario.setUserName(userName);
        }while (userName==null || userName=="");


        System.out.println("Ingrese su contraseña");
        password= sc.nextLine();
        usuario.setPassword(password);

        

        if (usuario.authenticatePassword(password) == true) {
            System.out.println("Usuario Logueado correctamente");
        }else {
            System.out.println("Usuario Incorrecto");
        }
    }
}
