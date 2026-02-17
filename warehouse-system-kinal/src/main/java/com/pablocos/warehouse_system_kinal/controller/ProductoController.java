package com.pablocos.warehouse_system_kinal.controller;

import com.pablocos.warehouse_system_kinal.entity.Producto;
import com.pablocos.warehouse_system_kinal.repository.ProductoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoRepository repo;

    public ProductoController(ProductoRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<Producto> listar(){
        return repo.findAll();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto p){
        return repo.save(p);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscar(@PathVariable Long id){
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizar(@PathVariable Long id,
                                               @RequestBody Producto producto){

        if(!repo.existsById(id)){
            return ResponseEntity.notFound().build();
        }

        producto.setIdProducto(id);
        return ResponseEntity.ok(repo.save(producto));
    }
}
