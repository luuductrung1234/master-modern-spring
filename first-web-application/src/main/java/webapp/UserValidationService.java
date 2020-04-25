package webapp;

public class UserValidationService {
    public boolean isValidUser(String username, String password) {
        return username.equals("luuductrung1234") && password.equals("P@ssword1");
    }
}