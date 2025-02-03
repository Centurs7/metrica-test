package com.metrica.test.service;

import com.metrica.test.entity.Supplier;
import com.metrica.test.repository.MetricaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static com.metrica.test.utils.Utils.buildSupplier;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class MetricaServiceTest {

    @Mock
    private MetricaRepository metricaRepository;

    @InjectMocks
    private MetricaService metricaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetSupplierByIdClient() {

        Integer idClient = 1;
        List<Supplier> supplierMock = buildSupplier();

        when(metricaRepository.findAllByIdClient(idClient)).thenReturn(supplierMock);
        List<Supplier> result = metricaService.getSupplierByIdClient(idClient);

        assertEquals(2, result.size());
        verify(metricaRepository, times(1)).findAllByIdClient(idClient);
    }

    @Test
    void testGetSupplierByIdClientEmptyList() {
        Integer idClient = 1;

        when(metricaRepository.findAllByIdClient(idClient)).thenReturn(List.of());
        List<Supplier> result = metricaService.getSupplierByIdClient(idClient);

        assertEquals(0, result.size());
        verify(metricaRepository, times(1)).findAllByIdClient(idClient);
    }
}