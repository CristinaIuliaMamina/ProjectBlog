package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ViewResolver;

/**
 * Created by cristina on 9/10/2015.
 */
@Controller
public class DefaultRestController {

        @RequestMapping("/")
        public String handleRequest() {
            return "index.jsp";
        }

}
