package com.example.jpa_boot_1.dao;

import com.example.jpa_boot_1.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer>
{
}
