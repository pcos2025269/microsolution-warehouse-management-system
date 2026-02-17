package com.pablocos.warehouse_system_kinal.controller;

import com.pablocos.warehouse_system_kinal.entity.Empleado;
import com.pablocos.warehouse_system_kinal.repository.EmpleadoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoRepository rep;
    public EmpleadoController(EmpleadoRepository rep){this.rep = rep; }

    @GetMapping
    public List<Empleado> mostrar(){return rep.findAll();}

    @PostMapping
    public Empleado guardar(@RequestBody Empleado e){
        return rep.save(e);
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<Empleado> actualizar(@PathVariable String codEmpleado, @RequestBody Empleado empleado){
        if (!rep.existsById(codEmpleado)){
            return ResponseEntity.notFound().build();
        }
        empleado.setCodempleado(codEmpleado);
        return ResponseEntity.ok(rep.save(empleado));
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Empleado> buscarPorDPI(@PathVariable String codigo){
        return rep.findById(codigo)
                .map(Empleado-> ResponseEntity.ok(Empleado))
                .orElse(ResponseEntity.notFound().build());
    }

}
