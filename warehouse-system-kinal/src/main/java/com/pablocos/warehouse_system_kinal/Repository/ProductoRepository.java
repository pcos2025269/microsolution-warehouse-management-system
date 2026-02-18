package com.pablocos.warehouse_system_kinal.Repository;

import com.pablocos.warehouse_system_kinal.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
