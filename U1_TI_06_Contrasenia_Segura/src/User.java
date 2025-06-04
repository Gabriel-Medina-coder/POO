import javax.swing.*;
import java.sql.SQLOutput;

public class User {
    private String userName;
    private String password;

    public String setUserName(String userName) {
        String message = "";
        if (userName == null || userName.equals("")) {
            message = "Username cannot be empty";
            JOptionPane.showMessageDialog(null, message);
        }
        return message;
    }
    public String setPassword(String password) {
        int uppercase = 0;
        int lowercase = 0;
        int number = 0;

        for (int i=0; i< password.length(); i++) {
            char character = password.charAt(i);
            int ascii = (int) character;
            if (ascii >= 65 && ascii <= 90) {
                uppercase++;
            }else if (ascii >= 97 && ascii <= 122) {
                lowercase++;
            } else if (ascii >= 48 && ascii <= 57) {
                number++;
            }
        }
        if (uppercase == 0 && lowercase == 0 && number == 0){
            System.out.println("Password should contain at least one uppercase, lowercase, number");
        }
        return password;
    }

    public boolean checkPassword(String password) {
        boolean status;
        if (password == null || password.equals("")) {
            status = false;
            System.out.println("Access Denied");
        }
        else {
            System.out.println("Correct access");
            status = true;
        }
        return status;
    }
}
