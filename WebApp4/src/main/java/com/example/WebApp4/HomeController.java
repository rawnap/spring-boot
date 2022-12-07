package com.example.WebApp4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class HomeController
{
    @RequestMapping("home")
    public ModelAndView Web(@RequestParam("name") String myName)
    {
//        HttpSession session= req.getSession();
//        String name= req.getParameter("name");
        ModelAndView mv=new ModelAndView();
        mv.addObject("name", myName);
        mv.setViewName("home.jsp");
//        System.out.println("hi..."+ myName);
//        session.setAttribute("name", myName);
        return mv;
    }
}