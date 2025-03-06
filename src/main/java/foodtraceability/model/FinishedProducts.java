package foodtraceability.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@Data
@Document(collection = "finishedProducts")
public class FinishedProducts {
    @Id
    private String id;
    private String productId;
    private String productionBatchId;
    private String productName;
    private Packaging packaging;
    private int quantity;
    private Storage storage;
    private List<Distribution> distribution;
    private String status;
    private Instant createdAt;
    private Instant updatedAt;

    @Data
    public static class Packaging {
        private String type;
        private Size size;
        private String lotNumber;
        private Instant packagedDate;
    }

    @Data
    public static class Size {
        private double value;
        private String unit;
    }

    @Data
    public static class Storage {
        private String facilityId;
        private Instant storedDate;
        private Conditions conditions;
    }

    @Data
    public static class Conditions {
        private double temperature;
        private double humidity;
    }

    @Data
    public static class Distribution {
        private String destination;
        private Instant shippedDate;
        private String carrier;
        private String trackingNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductionBatchId(String productionBatchId) {
        this.productionBatchId = productionBatchId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setDistribution(List<Distribution> distribution) {
        this.distribution = distribution;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductionBatchId() {
        return productionBatchId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public Storage getStorage() {
        return storage;
    }

    public List<Distribution> getDistribution() {
        return distribution;
    }

    public String getStatus() {
        return status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
