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

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
