package Elab01_PasswordValid;

public class SimpleValidator implements  PasswordValidator{

    @Override
    public boolean validate(String password) {
        if(password.length()>=4)
            return true;
        return false;
    }
}
