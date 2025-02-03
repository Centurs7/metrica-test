package com.metrica.test.controller;

import com.metrica.test.entity.Supplier;
import com.metrica.test.service.MetricaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class MetricaController {

    private final MetricaService metricaService;

    public MetricaController(MetricaService metricaService) {
        this.metricaService = metricaService;
    }

    @GetMapping("/{idClient}")
    public List<Supplier> getAllSupplier(@PathVariable Integer idClient) {
        return metricaService.getSupplierByIdClient(idClient);
    }
}
