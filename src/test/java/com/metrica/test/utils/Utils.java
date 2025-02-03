package com.metrica.test.utils;

import com.metrica.test.entity.Supplier;

import java.time.LocalDate;
import java.util.List;

public class Utils {

    public static List<Supplier> buildSupplier() {
        return List.of(
                new Supplier(1, "Proveedor 1", LocalDate.of(2025, 1, 31), 1),
                new Supplier(2, "Proveedor 2", LocalDate.of(2025, 1, 31), 1));
    }
}
