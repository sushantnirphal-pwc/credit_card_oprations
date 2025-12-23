package com.creditcard.creditcard_service.dto;
public class BalanceUpdateRequest {
    private Double amount;
    private Boolean isDebit;

    public BalanceUpdateRequest() {
    }

    public BalanceUpdateRequest(Double amount, Boolean isDebit) {
        this.amount = amount;
        this.isDebit = isDebit;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getIsDebit() {
        return this.isDebit;
    }

    public void setIsDebit(Boolean isDebit) {
        this.isDebit = isDebit;
    }
}