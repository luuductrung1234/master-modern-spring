package webapp.springmvc;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    private String MODEL_MESSAGE_KEY = "message";
    @Autowired
    private UserValidationService userValidationService;

    /*
     * old request mapping
     */
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    @ResponseBody // this annotation will mark the result of this method
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView doLogin(@Valid LoginForm loginForm, BindingResult result) {
        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView("error");
            mav.addObject(MODEL_MESSAGE_KEY, "Login form is not valid");
            return mav;
        }
        if (userValidationService.isValidUser(loginForm.getUsername(), loginForm.getPassword())) {
            ModelAndView mav = new ModelAndView("index");
            mav.addObject(MODEL_MESSAGE_KEY, "Welcome " + loginForm.getUsername() + "!");
            return mav;
        }
        ModelAndView mav = new ModelAndView("login");
        mav.addObject(MODEL_MESSAGE_KEY, "Invalid username or password!");
        return mav;
    }
}