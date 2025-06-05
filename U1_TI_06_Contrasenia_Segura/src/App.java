import javax.swing.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User usuario = new User();

        String userName;

        do{
            System.out.println("Ingrese su usuario");
            userName= sc.nextLine();
            usuario.setUserName(userName);
        }while (userName==null || userName=="");

        
    }
}
