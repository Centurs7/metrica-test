package com.metrica.test.controller;

import com.metrica.test.entity.Supplier;
import com.metrica.test.service.MetricaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static com.metrica.test.utils.Utils.buildSupplier;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class MetricaControllerTest {

    private MockMvc mockMvc;

    @Mock
    private MetricaService metricaService;

    @InjectMocks
    private MetricaController metricaController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(metricaController).build();
    }

    @Test
    void testGetAllSupplier() throws Exception {
        Integer idClient = 1;
        List<Supplier> supplierMock = buildSupplier();

        when(metricaService.getSupplierByIdClient(idClient)).thenReturn(supplierMock);

        mockMvc.perform(get("/suppliers/{idClient}", idClient)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(2)))
                .andExpect(jsonPath("$[0].idSupplier", is(1)))
                .andExpect(jsonPath("$[1].idSupplier", is(2)));
        verify(metricaService, times(1)).getSupplierByIdClient(idClient);
    }

    @Test
    void testGetAllSupplierEmptyList() throws Exception {
        Integer idClient = 2;

        when(metricaService.getSupplierByIdClient(idClient)).thenReturn(List.of());

        mockMvc.perform(get("/suppliers/{idClient}", idClient)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(0)));
        verify(metricaService, times(1)).getSupplierByIdClient(idClient);
    }
}