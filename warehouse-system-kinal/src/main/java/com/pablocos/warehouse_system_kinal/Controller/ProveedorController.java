package com.pablocos.warehouse_system_kinal.Controller;

import com.pablocos.warehouse_system_kinal.Entity.Proveedor;
import com.pablocos.warehouse_system_kinal.Repository.ProveedorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    private final ProveedorRepository repo;

    public ProveedorController(ProveedorRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<Proveedor> listar(){
        return repo.findAll();
    }

    @PostMapping
    public Proveedor guardar(@RequestBody Proveedor proveedor){
        return repo.save(proveedor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proveedor> actualizar(@PathVariable int id, @RequestBody Proveedor proveedor){
        if (!repo.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        proveedor.setIdProveedor(id);
        return ResponseEntity.ok(repo.save(proveedor));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proveedor> buscarPorId(@PathVariable int id){
        return repo.findById(id)
                .map(proveedor -> ResponseEntity.ok(proveedor))
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> eliminar(@PathVariable int id){
        if (!repo.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}