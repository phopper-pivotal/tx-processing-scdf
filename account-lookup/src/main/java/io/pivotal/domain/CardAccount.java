package io.pivotal.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class CardAccount {
    @Id
    @GeneratedValue
    private long id;
    @NotNull
    private String cardHolder;
    private Integer expirationMonth;
    @NotNull
    private Integer expirationYear;
    private String accountNumber;
    @NotNull
    private Double accountLimitAmount;
    @NotNull
    private Double currentBalanceAmount;
    @NotNull
    private String currency;
    @NotNull
    private String lastFour;
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountLimitAmount() {
        return accountLimitAmount;
    }

    public void setAccountLimitAmount(Double accountLimitAmount) {
        this.accountLimitAmount = accountLimitAmount;
    }

    public Double getCurrentBalanceAmount() {
        return currentBalanceAmount;
    }

    public void setCurrentBalanceAmount(Double currentBalanceAmount) {
        this.currentBalanceAmount = currentBalanceAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLastFour() {
        return lastFour;
    }

    public void setLastFour(String lastFour) {
        this.lastFour = lastFour;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CardAccount{" +
                "id=" + id + '\'' +
                ", cardHolder='" + cardHolder + '\'' +
                ", expirationMonth=" + expirationMonth +
                ", expirationYear=" + expirationYear +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountLimitAmount=" + accountLimitAmount +
                ", currentBalanceAmount=" + currentBalanceAmount +
                ", currency='" + currency + '\'' +
                ", lastFour='" + lastFour + '\'' +
                ", address=" + address +
                '}';
    }
}