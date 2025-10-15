package com.anjox.interest.calc.api.core.domain;

import com.anjox.interest.calc.api.core.domain.enums.TypePaymentSlipEnum;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentSlipCalculed {

    private String code;

    private BigDecimal originalValue;

    private BigDecimal value;

    private LocalDate dueDate;

    private LocalDate paymentDate;

    private BigDecimal interest;

    private TypePaymentSlipEnum type;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(BigDecimal originalValue) {
        this.originalValue = originalValue;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public TypePaymentSlipEnum getType() {
        return type;
    }

    public void setType(TypePaymentSlipEnum type) {
        this.type = type;
    }
}
