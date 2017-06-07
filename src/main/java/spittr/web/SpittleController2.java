package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Administrator on 2017/6/7.
 */
@Controller
@RequestMapping(value = "/spittle2")
public class SpittleController2 {

    @RequestMapping(method = GET, value = "/{u1}")
    public String spittles2(Model m,
                            @PathVariable long u1) {
        m.addAttribute("u1", u1);
        return "spittles";
    }
}
