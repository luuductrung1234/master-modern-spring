package webapp.springmvc;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    private String MODEL_MESSAGE_KEY = "message";
    @Autowired
    private UserValidationService userValidationService;

    /*
     * old request mapping HTTP GET: http://localhost:8080/spring-mvc/helloworld
     */
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    @ResponseBody // this annotation will mark the result of this method
    public String sayHello(@RequestParam String name) {
        if (name == null)
            return "Hello World";
        return "Hello " + name;
    }

    /*
     * HTTP GET: http://localhost:8080/spring-mvc/login
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    /*
     * HTTP POST: http://localhost:8080/spring-mvc/login
     */
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