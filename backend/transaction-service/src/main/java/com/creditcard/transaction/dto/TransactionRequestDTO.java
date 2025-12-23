package com.creditcard.transaction.dto;

import com.creditcard.transaction.enums.TransactionType;
import jakarta.validation.constraints.*;
public class TransactionRequestDTO {

    @NotNull(message = "Card ID is required")
    @Positive(message = "Card ID must be positive")
    private Long cardId;

    @NotNull(message = "Transaction type is required")
    private TransactionType type;

    @NotNull(message = "Amount is required")
    @Positive(message = "Amount must be positive")
    @DecimalMin(value = "0.01", message = "Amount must be at least 0.01")
    @DecimalMax(value = "1000000.00", message = "Amount cannot exceed 1,000,000")
    private Double amount;

    @Size(max = 500, message = "Description must not exceed 500 characters")
    private String description;

    @Size(max = 200, message = "Merchant name must not exceed 200 characters")
    private String merchantName;

    @Size(max = 100, message = "Merchant category must not exceed 100 characters")
    private String merchantCategory;

    @Size(max = 500, message = "Notes must not exceed 500 characters")
    private String notes;

    private String ipAddress;

    public TransactionRequestDTO() {
    }

    public TransactionRequestDTO(Long cardId, TransactionType type, Double amount, String description, String merchantName, String merchantCategory, String notes, String ipAddress) {
        this.cardId = cardId;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.merchantName = merchantName;
        this.merchantCategory = merchantCategory;
        this.notes = notes;
        this.ipAddress = ipAddress;
    }

    public Long getCardId() {
        return this.cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public TransactionType getType() {
        return this.type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantCategory() {
        return this.merchantCategory;
    }

    public void setMerchantCategory(String merchantCategory) {
        this.merchantCategory = merchantCategory;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}