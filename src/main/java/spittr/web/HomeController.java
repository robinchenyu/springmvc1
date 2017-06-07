package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Administrator on 2017/5/30.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = GET)
    public String home() {
        System.out.println("get request!!!");
        return "home";
    }

    @RequestMapping(value="/h/", method = GET)
    public String h() {
        System.out.println("get /h/");
        return "h";
    }
}
