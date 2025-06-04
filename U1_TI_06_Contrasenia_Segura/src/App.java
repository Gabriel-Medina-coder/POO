import javax.swing.*;

public class App {
    public static void main(String[] args) {
    User usuario = new User();
    usuario.setUserName(JOptionPane.showInputDialog("Introduzca el nombre del usuario:"));
    usuario.setPassword(JOptionPane.showInputDialog("Ingresa tu contraseña"));
    }
}
