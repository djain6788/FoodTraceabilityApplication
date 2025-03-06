package foodtraceability.controller;


import foodtraceability.model.ProductionBatches;
import foodtraceability.service.ProductionBatchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/production-batches")
public class ProductionBatchesController {
    @Autowired
    private ProductionBatchesService service;

    @PostMapping
    public ResponseEntity<ProductionBatches> create(@RequestBody ProductionBatches batch) {
        return ResponseEntity.ok(service.create(batch));
    }

    @GetMapping
    public ResponseEntity<List<ProductionBatches>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductionBatches> getById(@PathVariable String id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductionBatches> update(@PathVariable String id, @RequestBody ProductionBatches batch) {
        return ResponseEntity.ok(service.update(id, batch));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
