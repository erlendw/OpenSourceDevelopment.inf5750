package no.uio.inf5750.Assignment1.controller;

import no.uio.inf5750.Assignment1.dao.MessageDao;
import no.uio.inf5750.Assignment1.model.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * Created by erlend on 08.09.2016.
 */
@Controller
public class BaseController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String welcome(ModelMap model) {

        model.addAttribute("message", "Maven Web Project + Spring 4 MVC - welcome()");

        //Spring uses InternalResourceViewResolver and return back index.jsp
        return "index";

    }
    @RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
    public String welcomeName(@PathVariable String name, ModelMap model) {

        model.addAttribute("message", "Maven Web Project + Spring 4 MVC - " + name);
        return "index";

    }

    @RequestMapping(value="/hello/{name}", method = RequestMethod.GET)
    public String helloWorld(@PathVariable String name, ModelMap model) {

        model.addAttribute("message", name);
        return "hello";

    }

}