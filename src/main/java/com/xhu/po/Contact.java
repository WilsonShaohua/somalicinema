package com.xhu.po;

import java.math.BigDecimal;

public class Contact {
    private String concatId;

    private BigDecimal concatNumber;

    public String getConcatId() {
        return concatId;
    }

    public void setConcatId(String concatId) {
        this.concatId = concatId == null ? null : concatId.trim();
    }

    public BigDecimal getConcatNumber() {
        return concatNumber;
    }

    public void setConcatNumber(BigDecimal concatNumber) {
        this.concatNumber = concatNumber;
    }
}