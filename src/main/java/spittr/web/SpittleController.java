package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Administrator on 2017/6/6.
 */
@Controller
@RequestMapping(value="/spittles")
public class SpittleController {
    @RequestMapping(method = GET)
    public String spittles(Model model,
                           @RequestParam(defaultValue = "123") String u1) {
        List<SpittlesRep> srList = new ArrayList<SpittlesRep>();
        System.out.println("get u1" + u1);
        SpittlesRep sr = new SpittlesRep();
        sr.setUsername("robin");
        sr.setAge(13);
        srList.add(sr);
        model.addAttribute("srList", srList);
        model.addAttribute("u1", u1);
        return "spittles";
    }
}
