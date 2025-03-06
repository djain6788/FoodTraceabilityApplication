package foodtraceability.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@Data
@Document(collection = "productionBatches")
public class ProductionBatches {
    @Id
    private String id;
    private String batchId;
    private String productName;
    private List<RawMaterialUsed> rawMaterials;
    private Process process;
    private Quantity outputQuantity;
    private String status;
    private Instant createdAt;
    private Instant updatedAt;

    @Data
    public static class RawMaterialUsed {
        private String materialId;
        private String batchId;
        private Quantity quantityUsed;
    }

    @Data
    public static class Process {
        private Instant startTime;
        private Instant endTime;
        private String facilityId;
        private List<Step> steps;
    }

    @Data
    public static class Step {
        private String stepName;
        private int duration;
        private Instant timestamp;
        private String operator;
    }

    @Data
    public static class Quantity {
        private double value;
        private String unit;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setRawMaterials(List<RawMaterialUsed> rawMaterials) {
        this.rawMaterials = rawMaterials;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public void setOutputQuantity(Quantity outputQuantity) {
        this.outputQuantity = outputQuantity;
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

    public String getBatchId() {
        return batchId;
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Process getProcess() {
        return process;
    }

    public List<RawMaterialUsed> getRawMaterials() {
        return rawMaterials;
    }

    public Quantity getOutputQuantity() {
        return outputQuantity;
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
