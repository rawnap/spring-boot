package com.example.jpa_boot.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.jpa_boot.Alien;
public interface AlienRepo extends CrudRepository<Alien, Integer>
{
}
