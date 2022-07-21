package com.jins.hamburger.domain.hamburger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface HamburgerRepository extends JpaRepository<Hamburger, Long> {
    @Query("SELECT p FROM Hamburger p ORDER BY p.id DESC")
    List<Hamburger> findAllDesc();
}
