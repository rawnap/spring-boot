package com.example.jpa_boot_6;

import com.example.jpa_boot_6.dao.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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


    @PostMapping ("/alien")
   // @PostMapping(path = "/alien", consumes = {"application/json"})
    public Alien AddAlien(@RequestBody Alien alien)
    {
        repo.save(alien);
        return alien;
    }



    @RequestMapping(path = "/aliens")
    @ResponseBody
    public List<Alien> getAliens()
    {
        return repo.findAll();

    }


    @RequestMapping("/alien/{aid}")
    @ResponseBody
    public Optional<Alien> getAlien(@PathVariable("aid") int aid)
    {
        return repo.findById(aid);
    }
}

