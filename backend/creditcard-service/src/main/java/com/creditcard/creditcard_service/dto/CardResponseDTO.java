package com.creditcard.creditcard_service.dto;


import java.time.LocalDate;
import java.time.LocalDateTime;

import com.creditcard.creditcard_service.enums.CardStatus;
import com.creditcard.creditcard_service.enums.CardType;
import com.fasterxml.jackson.annotation.JsonFormat;
public class CardResponseDTO {

    private Long id;
    private String cardNumber;
    private String maskedCardNumber;  // e.g., "XXXX XXXX XXXX 1234"
    private Long customerId;
    private String cardHolderName;
    private CardType cardType;
    private CardStatus status;
    private Double creditLimit;
    private Double availableCredit;
    private Double dailyLimit;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate issueDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate expiryDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime activationDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime lastUsedDate;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime createdAt;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime updatedAt;

    // CVV is never returned in response for security

    public CardResponseDTO() {
    }

    public CardResponseDTO(Long id, String cardNumber, Long customerId, String cardHolderName, CardType cardType, CardStatus status, Double creditLimit, Double availableCredit, Double dailyLimit, LocalDate issueDate, LocalDate expiryDate, LocalDateTime activationDate, LocalDateTime lastUsedDate, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.customerId = customerId;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.status = status;
        this.creditLimit = creditLimit;
        this.availableCredit = availableCredit;
        this.dailyLimit = dailyLimit;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.activationDate = activationDate;
        this.lastUsedDate = lastUsedDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardStatus getStatus() {
        return this.status;
    }

    public void setStatus(CardStatus status) {
        this.status = status;
    }

    public Double getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Double getAvailableCredit() {
        return this.availableCredit;
    }

    public void setAvailableCredit(Double availableCredit) {
        this.availableCredit = availableCredit;
    }

    public Double getDailyLimit() {
        return this.dailyLimit;
    }

    public void setDailyLimit(Double dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public LocalDate getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDateTime getActivationDate() {
        return this.activationDate;
    }

    public void setActivationDate(LocalDateTime activationDate) {
        this.activationDate = activationDate;
    }

    public LocalDateTime getLastUsedDate() {
        return this.lastUsedDate;
    }

    public void setLastUsedDate(LocalDateTime lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
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