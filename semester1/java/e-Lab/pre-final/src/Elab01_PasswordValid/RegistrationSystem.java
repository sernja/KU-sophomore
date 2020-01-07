package Elab01_PasswordValid;

import java.util.ArrayList;

public class RegistrationSystem {
    private ArrayList<User> userList = new ArrayList<>();
    private PasswordValidator validator;

    public void setPasswordValidator(PasswordValidator validator) {
            this.validator = validator;
    }
    public boolean register(String username, String password) {
        boolean canAdd = validator.validate(password);
        if(canAdd)
            userList.add(new User(username,password));
        return canAdd;
    }
}