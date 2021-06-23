package com.portfolio.ann.repositories;

import com.portfolio.ann.models.Closet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClosetRepository extends JpaRepository<Closet, Long> {
    Closet findByClosetName(String closetName);
}
