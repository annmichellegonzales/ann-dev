package com.portfolio.ann.repositories;

import com.portfolio.ann.models.Shoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoesRepo extends JpaRepository<Shoes, Long> {
}
