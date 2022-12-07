package com.example.WebApp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class HomeController
{
    @RequestMapping("home")
    public String Web(HttpServletRequest req)
    {
        HttpSession session= req.getSession();
        String name= req.getParameter("name");
        System.out.println("hi..."+ name);
        req.setAttribute("name", name);
        return "home.jsp";
    }
}