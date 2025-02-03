package com.metrica.test.service;

import com.metrica.test.entity.Supplier;
import com.metrica.test.repository.MetricaRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MetricaService {

    private final MetricaRepository metricaRepository;

    public MetricaService(MetricaRepository metricaRepository) {
        this.metricaRepository = metricaRepository;
    }

    public List<Supplier> getSupplierByIdClient(Integer idClient) {
        List<Supplier> suppliers = metricaRepository.findAllByIdClient(idClient);
        return suppliers.isEmpty() ? Collections.emptyList() : suppliers;
    }
}
