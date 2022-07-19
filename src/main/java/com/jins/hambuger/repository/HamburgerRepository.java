package com.jins.hambuger.repository;

import com.jins.hambuger.domain.Hamburger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HamburgerRepository extends JpaRepository<Hamburger, Long> {

}