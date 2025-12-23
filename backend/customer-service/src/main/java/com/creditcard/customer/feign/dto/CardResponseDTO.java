package com.creditcard.customer.feign.dto;
import java.math.BigDecimal;
import java.time.LocalDate;
public class CardResponseDTO {
    private Long id;
    private String cardNumber;
    private Long customerId;
    private BigDecimal creditLimit;
    private BigDecimal availableCredit;
    private String cardType;
    private String status;
    private LocalDate expiryDate;

    public CardResponseDTO() {
    }

    public CardResponseDTO() {
    }

    public CardResponseDTO(Long id, String cardNumber, Long customerId, BigDecimal creditLimit, BigDecimal availableCredit, String cardType, String status, LocalDate expiryDate) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.customerId = customerId;
        this.creditLimit = creditLimit;
        this.availableCredit = availableCredit;
        this.cardType = cardType;
        this.status = status;
        this.expiryDate = expiryDate;
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

    public BigDecimal getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getAvailableCredit() {
        return this.availableCredit;
    }

    public void setAvailableCredit(BigDecimal availableCredit) {
        this.availableCredit = availableCredit;
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String cardNumber;
        private Long customerId;
        private BigDecimal creditLimit;
        private BigDecimal availableCredit;
        private String cardType;
        private String status;
        private LocalDate expiryDate;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder customerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder creditLimit(BigDecimal creditLimit) {
            this.creditLimit = creditLimit;
            return this;
        }

        public Builder availableCredit(BigDecimal availableCredit) {
            this.availableCredit = availableCredit;
            return this;
        }

        public Builder cardType(String cardType) {
            this.cardType = cardType;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder expiryDate(LocalDate expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public CardResponseDTO build() {
            CardResponseDTO obj = new CardResponseDTO();
            obj.setId(this.id);
            obj.setCardNumber(this.cardNumber);
            obj.setCustomerId(this.customerId);
            obj.setCreditLimit(this.creditLimit);
            obj.setAvailableCredit(this.availableCredit);
            obj.setCardType(this.cardType);
            obj.setStatus(this.status);
            obj.setExpiryDate(this.expiryDate);
            return obj;
        }
    }
}