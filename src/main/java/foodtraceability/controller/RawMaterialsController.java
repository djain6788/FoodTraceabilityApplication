package foodtraceability.controller;


import foodtraceability.model.RawMaterials;
import foodtraceability.service.RawMaterialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/raw-materials")
public class RawMaterialsController {
    @Autowired
    private RawMaterialsService service;

    @PostMapping
    public ResponseEntity<RawMaterials> create(@RequestBody RawMaterials rawMaterials) {
        return ResponseEntity.ok(service.create(rawMaterials));
    }

    @GetMapping
    public ResponseEntity<List<RawMaterials>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RawMaterials> getById(@PathVariable String id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<RawMaterials> update(@PathVariable String id, @RequestBody RawMaterials rawMaterials) {
        return ResponseEntity.ok(service.update(id, rawMaterials));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
