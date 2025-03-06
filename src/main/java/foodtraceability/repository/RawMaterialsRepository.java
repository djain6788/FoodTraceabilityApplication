package foodtraceability.repository;

import foodtraceability.model.RawMaterials;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RawMaterialsRepository extends MongoRepository<RawMaterials, String> {
}
