package foodtraceability.service;


import foodtraceability.model.ProductionBatches;
import foodtraceability.repository.ProductionBatchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class ProductionBatchesService {
    @Autowired
    private ProductionBatchesRepository repository;

    public ProductionBatches create(ProductionBatches batch) {
        batch.setCreatedAt(Instant.now());
        batch.setUpdatedAt(Instant.now());
        return repository.save(batch);
    }

    public List<ProductionBatches> getAll() {
        return repository.findAll();
    }

    public Optional<ProductionBatches> getById(String id) {
        return repository.findById(id);
    }

    public ProductionBatches update(String id, ProductionBatches batch) {
        batch.setId(id);
        batch.setUpdatedAt(Instant.now());
        return repository.save(batch);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
