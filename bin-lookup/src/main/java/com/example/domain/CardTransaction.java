package com.example.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CardTransaction {
    private String cardHolder;
    private Integer expirationMonth;
    private Integer expirationYear;
    private Integer cvv;
    private String accountNumber;

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public Integer getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBin() {
        if (this.getAccountNumber().isEmpty()) {
            return "";
        }

        if (this.getAccountNumber().length() < 6) {
            return "";
        }

        return this.getAccountNumber().substring(0, 5);
    }

    @Override
    public String toString() {
        return "CardTransaction{" +
                "cardHolder='" + cardHolder + '\'' +
                ", expirationMonth=" + expirationMonth +
                ", expirationYear=" + expirationYear +
                ", cvv=" + cvv +
                ", accountNumber='" + accountNumber + '\'' +
                ", bin='" + getBin() + '\'' +
                '}';
    }
}