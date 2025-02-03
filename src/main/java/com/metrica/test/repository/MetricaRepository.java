package com.metrica.test.repository;

import com.metrica.test.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MetricaRepository extends JpaRepository<Supplier, Integer> {

    List<Supplier> findAllByIdClient(Integer id);
}
