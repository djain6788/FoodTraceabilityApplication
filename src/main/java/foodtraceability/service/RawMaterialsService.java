package foodtraceability.service;


import foodtraceability.model.RawMaterials;
import foodtraceability.repository.RawMaterialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class RawMaterialsService {
    @Autowired
    private RawMaterialsRepository repository;

    public RawMaterials create(RawMaterials rawMaterials) {
        rawMaterials.setCreatedAt(Instant.now());
        rawMaterials.setUpdatedAt(Instant.now());
        return repository.save(rawMaterials);
    }

    public List<RawMaterials> getAll() {
        return repository.findAll();
    }

    public Optional<RawMaterials> getById(String id) {
        return repository.findById(id);
    }

    public RawMaterials update(String id, RawMaterials rawMaterials) {
        rawMaterials.setId(id);
        rawMaterials.setUpdatedAt(Instant.now());
        return repository.save(rawMaterials);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}