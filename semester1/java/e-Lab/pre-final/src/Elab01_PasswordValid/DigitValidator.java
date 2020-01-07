package Elab01_PasswordValid;

public class DigitValidator implements  PasswordValidator {

    @Override
    public boolean validate(String password) {
        boolean hasNumber = false;
        if(password.length()>=6){
            for(int i=0;i<password.length();i++){
                if(password.charAt(i)=='0' || password.charAt(i)=='1' || password.charAt(i)=='2' ||
                        password.charAt(i)=='3' || password.charAt(i)=='4' || password.charAt(i)=='5' ||
                        password.charAt(i)=='6' || password.charAt(i)=='7' || password.charAt(i)=='8'
                        || password.charAt(i)=='9'){
                    hasNumber = true;
                }
            }
            if(hasNumber)
                return true;
            return false;
        }
        return false;
    }
}
