package com.pablocos.warehouse_system_kinal.Controller;

import com.pablocos.warehouse_system_kinal.Entity.Prestamo;
import com.pablocos.warehouse_system_kinal.Repository.PrestamoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamo")
public class PrestamoController {

    private final PrestamoRepository repo;

    public PrestamoController(PrestamoRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<Prestamo> Listar(){
        return repo.findAll();
    }

    @PostMapping
    public Prestamo guardar(@RequestBody Prestamo p){
        return repo.save(p);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> buscarPorId(@PathVariable String id){
        return repo.findById(id)
                .map(ResponseEntity::ok) // Forma más limpia de escribir la lambda
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prestamo> actualizar(@PathVariable String id, @RequestBody Prestamo prestamo) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        prestamo.setIdPrestamo(id);
        return ResponseEntity.ok(repo.save(prestamo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}