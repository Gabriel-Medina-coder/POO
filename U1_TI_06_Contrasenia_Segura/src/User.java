import javax.swing.*;
import java.sql.SQLOutput;

public class User {
    private String userName;
    private String password;

    public void setUserName(String userName) {
        if(userName==null || userName.equals("")){
            System.out.println("User cannot be empty");
        }else {
            this.userName = userName;
        }
    }

    public void setPassword(String password) {
        char character;
        int ascii;

        int uppercase=0;
        int lowercase=0;
        int digit=0;

        if(password.length()<8){
            System.out.println("Password cannot be less than 8 characters");
        }else {
            for (int i = 0; i<password.length(); i++) {
                character = password.charAt(i);
                ascii = (int)  character;

                if (ascii >= 65 && ascii <= 90) {
                    uppercase++;
                } else if (ascii >= 97 && ascii <= 122) {
                    lowercase++;
                }else if (ascii >= 48 && ascii <= 57) {
                    digit++;
                }
            }
            if (uppercase != 0 && lowercase != 0 && digit != 0) {
                this.password = password;
            }else {
                System.out.println("The password should contain at least an uppercase, lowercase, and digit, try again");
            }
        }
    }

    public boolean authenticatePassword(String password) {
        return this.password.equals(password);
    }
}
