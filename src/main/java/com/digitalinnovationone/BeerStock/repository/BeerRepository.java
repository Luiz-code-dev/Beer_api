package com.digitalinnovationone.BeerStock.repository;

import com.digitalinnovationone.BeerStock.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository  extends JpaRepository<Beer, Long>{

    Optional<Beer> findByName(String name);
}
