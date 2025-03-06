package foodtraceability.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Document(collection = "rawMaterials")
public class RawMaterials {
    @Id
    private String id;
    private String materialName;
    private String supplierId;
    private String batchId;
    private Origin origin;
    private Instant receivedDate;
    private Quantity quantity;
    private QualityCheck qualityCheck;
    private String status;
    private Instant createdAt;
    private Instant updatedAt;

    @Data
    public static class Origin {
        private String farmName;
        private Location location;
    }

    @Data
    public static class Location {
        private double latitude;
        private double longitude;
    }

    @Data
    public static class Quantity {
        private double value;
        private String unit;
    }

    @Data
    public static class QualityCheck {
        private String status;
        private String inspector;
        private Instant timestamp;
        private String notes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public void setReceivedDate(Instant receivedDate) {
        this.receivedDate = receivedDate;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public void setQualityCheck(QualityCheck qualityCheck) {
        this.qualityCheck = qualityCheck;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getBatchId() {
        return batchId;
    }

    public Origin getOrigin() {
        return origin;
    }

    public Instant getReceivedDate() {
        return receivedDate;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public QualityCheck getQualityCheck() {
        return qualityCheck;
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
