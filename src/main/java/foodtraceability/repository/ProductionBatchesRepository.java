package foodtraceability.repository;


import foodtraceability.model.ProductionBatches;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductionBatchesRepository extends MongoRepository<ProductionBatches, String> {
}