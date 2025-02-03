package com.metrica.test.utils;

import com.metrica.test.entity.Supplier;
import com.metrica.test.repository.MetricaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final MetricaRepository metricaRepository;

    public DataLoader(MetricaRepository metricaRepository) {
        this.metricaRepository = metricaRepository;
    }

    @Override
    public void run(String... args) {
        metricaRepository.saveAll(List.of(
                new Supplier("Coca-cola", LocalDate.of(2025, 1, 31), 5),
                new Supplier("Pepsi", LocalDate.of(2025, 1, 31), 5),
                new Supplier("Redbull", LocalDate.of(2025, 1, 31), 6),
                new Supplier("Fanta", LocalDate.of(2025, 1, 31), 7),
                new Supplier("Casera", LocalDate.of(2025, 1, 31), 8),
                new Supplier("Trina", LocalDate.of(2025, 1, 31), 6)
        ));
    }
}
