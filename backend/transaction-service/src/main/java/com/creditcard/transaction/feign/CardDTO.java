package com.creditcard.transaction.feign;
public class CardDTO {
    private Long id;
    private String cardNumber;
    private String maskedCardNumber;
    private Long customerId;
    private String cardHolderName;
    private String cardType;
    private String status;
    private Double creditLimit;
    private Double availableCredit;
    private Double dailyLimit;

    public CardDTO() {
    }

    public CardDTO(Long id, String cardNumber, String maskedCardNumber, Long customerId, String cardHolderName, String cardType, String status, Double creditLimit, Double availableCredit, Double dailyLimit) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.maskedCardNumber = maskedCardNumber;
        this.customerId = customerId;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.status = status;
        this.creditLimit = creditLimit;
        this.availableCredit = availableCredit;
        this.dailyLimit = dailyLimit;
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

    public String getMaskedCardNumber() {
        return this.maskedCardNumber;
    }

    public void setMaskedCardNumber(String maskedCardNumber) {
        this.maskedCardNumber = maskedCardNumber;
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
}