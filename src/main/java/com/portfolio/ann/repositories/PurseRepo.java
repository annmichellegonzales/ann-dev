package com.portfolio.ann.repositories;

import com.portfolio.ann.models.Purse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurseRepo extends JpaRepository<Purse, Long> {
}
