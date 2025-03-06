package foodtraceability.controller;

import foodtraceability.model.FinishedProducts;
import foodtraceability.service.FinishedProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/finished-products")
public class FinishedProductsController {
    @Autowired
    private FinishedProductsService service;

    @PostMapping
    public ResponseEntity<FinishedProducts> create(@RequestBody FinishedProducts product) {
        return ResponseEntity.ok(service.create(product));
    }

    @GetMapping
    public ResponseEntity<List<FinishedProducts>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FinishedProducts> getById(@PathVariable String id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FinishedProducts> update(@PathVariable String id, @RequestBody FinishedProducts product) {
        return ResponseEntity.ok(service.update(id, product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}