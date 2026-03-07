package ss6_inheritance.validate;

public class Validation {

    public static boolean validateEmail(String email){
        String emailRegex = "^[a-zA-Z]\\w{5,20}@[a-z]{3,10}\\.[a-z]{2,5}$";
        return email.matches(emailRegex);
    }
}
