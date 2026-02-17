package com.pablocos.warehouse_system_kinal.repository;

import com.pablocos.warehouse_system_kinal.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
