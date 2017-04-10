package com.example.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * JSON string from Payout.com
 *
 * curl https://bins.payout.com/api/v1/bins/43425
 *
 * returns: { "bin":"434256",
 *            "brand":"VISA",
 *            "issuer":"WELLS FARGO BANK, N.A.",
 *            "type":"DEBIT",
 *            "country_code":"US",
 *            "is_prepaid":false
 *            }
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardBin {
    String bin;
    String brand;
    String issuer;
    String type;
    String countryCode;
    boolean isPrepaid;

    public CardBin() {

    }

    public CardBin(String bin, String brand, String issuer, String type, String countryCode, boolean isPrepaid) {
        this.bin = bin;
        this.brand = brand;
        this.issuer = issuer;
        this.type = type;
        this.countryCode = countryCode;
        this.isPrepaid = isPrepaid;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isPrepaid() {
        return isPrepaid;
    }

    public void setPrepaid(boolean prepaid) {
        this.isPrepaid = isPrepaid;
    }

    @Override
    public String toString() {
        return "CardBin{" +
                "bin='" + bin + '\'' +
                ", brand='" + brand + '\'' +
                ", issuer='" + issuer + '\'' +
                ", type='" + type + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", isPrepaid=" + isPrepaid +
                '}';
    }
}