package com.example.demo.repositories;

import com.example.demo.entities.EntityGoods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryGoods extends JpaRepository <EntityGoods, Long> {

}
