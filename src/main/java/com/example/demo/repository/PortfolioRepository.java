package com.example.demo.repository;

import com.example.demo.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 9. 9..
 */
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {}
