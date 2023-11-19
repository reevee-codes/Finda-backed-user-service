package com.finda.repository;

import com.finda.model.Dupa;
import com.finda.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DupaRepository extends JpaRepository<Dupa, Long> {
}
