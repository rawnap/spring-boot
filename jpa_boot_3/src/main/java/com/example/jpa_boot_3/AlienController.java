package com.example.jpa_boot_3;
import com.example.jpa_boot_3.dao.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController
{

    @Autowired
    AlienRepo repo;
    @RequestMapping("/")
    public String home()
    {
        return"home.jsp";
    }
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien)
    {
        repo.save(alien);
        return "home.jsp";
    }

    @RequestMapping("/aliens")
    @ResponseBody
    public String getAliens()
    {
        return repo.findAll().toString();
//        ModelAndView mv= new ModelAndView("ShowAlien.jsp");
//        Alien alien= repo.findById(aid).orElse(new Alien());

//        System.out.println(repo.findByTech("Java"));
//        System.out.println(repo.findByAidGreaterThan(102));
//        System.out.println(repo.findByTechSorted("Java"));

//        mv.addObject(alien);
//        return mv;
    }


    @RequestMapping("/alien/{aid}")
    @ResponseBody
    public String getAlien(@PathVariable("aid") int aid)
    {
        return repo.findById(aid).toString();
    }
}
