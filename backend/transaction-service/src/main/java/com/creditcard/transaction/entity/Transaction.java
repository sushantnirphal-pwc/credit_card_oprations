package com.creditcard.transaction.entity;

import com.creditcard.transaction.enums.TransactionStatus;
import com.creditcard.transaction.enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "transactions", indexes = {
    @Index(name = "idx_card_id", columnList = "card_id"),
    @Index(name = "idx_customer_id", columnList = "customer_id"),
    @Index(name = "idx_transaction_date", columnList = "transaction_date"),
    @Index(name = "idx_status", columnList = "status"),
    @Index(name = "idx_type", columnList = "type")
})
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transaction_reference", nullable = false, unique = true, length = 50)
    private String transactionReference;

    @Column(name = "card_id", nullable = false)
    private Long cardId;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionType type;

    @Column(nullable = false)
    private Double amount;

    @Column(length = 3)
    private String currency = "USD";

    @Column(length = 500)
    private String description;

    @Column(name = "merchant_name", length = 200)
    private String merchantName;

    @Column(name = "merchant_category", length = 100)
    private String merchantCategory;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionStatus status;

    @Column(name = "transaction_date", nullable = false)
    private LocalDateTime transactionDate;

    @Column(name = "previous_balance")
    private Double previousBalance;

    @Column(name = "new_balance")
    private Double newBalance;

    @Column(name = "authorization_code", length = 50)
    private String authorizationCode;

    @Column(name = "failure_reason", length = 500)
    private String failureReason;

    @Column(name = "is_reversed")
    private Boolean isReversed = false;

    @Column(name = "reversal_reference", length = 50)
    private String reversalReference;

    @Column(name = "ip_address", length = 45)
    private String ipAddress;

    @Column(length = 500)
    private String notes;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public boolean isSuccessful() {
        return status == TransactionStatus.SUCCESS;
    }

    public boolean canBeReversed() {
        return isSuccessful() && !isReversed && 
               (type == TransactionType.PURCHASE || type == TransactionType.PAYMENT);
    }

    public Transaction() {
    }

    public Transaction(Long id, String transactionReference, Long cardId, Long customerId, TransactionType type, Double amount, String currency, String description, String merchantName, String merchantCategory, TransactionStatus status, LocalDateTime transactionDate, Double previousBalance, Double newBalance, String authorizationCode, String failureReason, Boolean isReversed, String reversalReference, String ipAddress, String notes, LocalDateTime createdAt, LocalDateTime updatedAt) {
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
        this.ipAddress = ipAddress;
        this.notes = notes;
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

    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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