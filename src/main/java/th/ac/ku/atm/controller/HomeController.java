package th.ac.ku.atm.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(Model model) {
        // return home.html
        model.addAttribute("greeting", "Sawaddee");
        return "home";
    }
}
