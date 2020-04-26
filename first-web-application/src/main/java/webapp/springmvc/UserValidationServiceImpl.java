package webapp.springmvc;

import org.springframework.stereotype.Component;

@Component
public class UserValidationServiceImpl implements UserValidationService {
    public boolean isValidUser(String username, String password) {
        return username.equals("luuductrung1234") && password.equals("P@ssword1");
    }
}