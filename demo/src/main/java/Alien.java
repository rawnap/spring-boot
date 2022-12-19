package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
class Alien
{
    private int aid;
    private String aname;
    private String tech;


    public Alien()
    {
        System.out.println("object created..");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show()
    {
        System.out.println("in show");
        laptop.compile();
        laptop.dikha();
    }
    @Autowired
    private Laptop laptop;
    public void show1()
    {
        laptop.compile();
        laptop.dikha();
    }
}
