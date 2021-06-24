package com.portfolio.ann.repositories;

import com.portfolio.ann.models.Dress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DressRepo extends JpaRepository<Dress, Long> {
}