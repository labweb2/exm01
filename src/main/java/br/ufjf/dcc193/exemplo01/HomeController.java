package br.ufjf.dcc193.exemplo01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @RequestMapping("index.html")
    ModelAndView home(Pessoa p){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("pessoa",p);
        return mv;
    }
    @RequestMapping("form.html")
    String form(){
        return "form";
    }
}