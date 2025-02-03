package com.metrica.test.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Proveedores")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    @JsonProperty("idSupplier")
    private Integer idSupplier;
    @Column(name = "nombre")
    @JsonProperty("name")
    private String name;
    @Column(name = "fecha_de_alta")
    @JsonProperty("dischargeDate")
    private LocalDate dischargeDate;
    @Column(name = "id_cliente")
    @JsonProperty("idClient")
    private Integer idClient;

    public Supplier() {
    }

    public Supplier(Integer idSupplier, String name, LocalDate dischargeDate, Integer idClient) {
        this.idSupplier = idSupplier;
        this.name = name;
        this.dischargeDate = dischargeDate;
        this.idClient = idClient;
    }

    public Supplier(String name, LocalDate dischargeDate, Integer idClient) {
        this.name = name;
        this.dischargeDate = dischargeDate;
        this.idClient = idClient;
    }
}
