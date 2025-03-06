package foodtraceability.service;


import foodtraceability.model.FinishedProducts;
import foodtraceability.repository.FinishedProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class FinishedProductsService {
    @Autowired
    private FinishedProductsRepository repository;

    public FinishedProducts create(FinishedProducts product) {
        product.setCreatedAt(Instant.now());
        product.setUpdatedAt(Instant.now());
        return repository.save(product);
    }

    public List<FinishedProducts> getAll() {
        return repository.findAll();
    }

    public Optional<FinishedProducts> getById(String id) {
        return repository.findById(id);
    }

    public FinishedProducts update(String id, FinishedProducts product) {
        product.setId(id);
        product.setUpdatedAt(Instant.now());
        return repository.save(product);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}