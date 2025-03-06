package foodtraceability.repository;


import foodtraceability.model.FinishedProducts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FinishedProductsRepository extends MongoRepository<FinishedProducts, String> {
}
