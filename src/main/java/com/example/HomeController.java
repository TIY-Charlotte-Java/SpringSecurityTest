package com.example;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Ben on 2/21/17.
 */
@Controller
public class HomeController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(UsernamePasswordAuthenticationToken p) {
        if (p.getAuthorities().contains("ROLE_ADMIN")) {
            return "ADMINTEMPLATE";
        } else {
            return "NOTADMINTEMPLATE";
        }
    }
}
