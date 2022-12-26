package com.example.jpa_boot_6.dao;

import com.example.jpa_boot_6.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{

}
