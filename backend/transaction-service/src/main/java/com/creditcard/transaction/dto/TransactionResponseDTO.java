package com.creditcard.transaction.dto;

import com.creditcard.transaction.enums.TransactionStatus;
import com.creditcard.transaction.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
public class TransactionResponseDTO {

    private Long id;
    private String transactionReference;
    private Long cardId;
    private Long customerId;
    private TransactionType type;
    private Double amount;
    private String currency;
    private String description;
    private String merchantName;
    private String merchantCategory;
    private TransactionStatus status;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime transactionDate;

    private Double previousBalance;
    private Double newBalance;
    private String authorizationCode;
    private String failureReason;
    private Boolean isReversed;
    private String reversalReference;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime updatedAt;

    public TransactionResponseDTO() {
    }

    public TransactionResponseDTO(Long id, String transactionReference, Long cardId, Long customerId, TransactionType type, Double amount, String currency, String description, String merchantName, String merchantCategory, TransactionStatus status, LocalDateTime transactionDate, Double previousBalance, Double newBalance, String authorizationCode, String failureReason, Boolean isReversed, String reversalReference, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.transactionReference = transactionReference;
        this.cardId = cardId;
        this.customerId = customerId;
        this.type = type;
        this.amount = amount;
        this.currency = currency;
        this.description = description;
        this.merchantName = merchantName;
        this.merchantCategory = merchantCategory;
        this.status = status;
        this.transactionDate = transactionDate;
        this.previousBalance = previousBalance;
        this.newBalance = newBalance;
        this.authorizationCode = authorizationCode;
        this.failureReason = failureReason;
        this.isReversed = isReversed;
        this.reversalReference = reversalReference;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionReference() {
        return this.transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public Long getCardId() {
        return this.cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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

    public TransactionStatus getStatus() {
        return this.status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public LocalDateTime getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getPreviousBalance() {
        return this.previousBalance;
    }

    public void setPreviousBalance(Double previousBalance) {
        this.previousBalance = previousBalance;
    }

    public Double getNewBalance() {
        return this.newBalance;
    }

    public void setNewBalance(Double newBalance) {
        this.newBalance = newBalance;
    }

    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    public String getFailureReason() {
        return this.failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public Boolean getIsReversed() {
        return this.isReversed;
    }

    public void setIsReversed(Boolean isReversed) {
        this.isReversed = isReversed;
    }

    public String getReversalReference() {
        return this.reversalReference;
    }

    public void setReversalReference(String reversalReference) {
        this.reversalReference = reversalReference;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}