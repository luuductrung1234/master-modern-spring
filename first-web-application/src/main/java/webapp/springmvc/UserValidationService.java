package webapp.springmvc;

public interface UserValidationService {
    public boolean isValidUser(String username, String password);
}