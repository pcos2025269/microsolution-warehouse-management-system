package com.pablocos.warehouse_system_kinal.Repository;

import com.pablocos.warehouse_system_kinal.Entity.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PrestamoRepository extends JpaRepository<Prestamo,String>{
}
