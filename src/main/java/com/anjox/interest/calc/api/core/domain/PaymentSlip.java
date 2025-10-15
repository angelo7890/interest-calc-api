package com.anjox.interest.calc.api.core.domain;

import com.anjox.interest.calc.api.core.domain.enums.TypePaymentSlipEnum;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PaymentSlip {

    private String code;

    private LocalDate dueDate;

    private BigDecimal value;

    private TypePaymentSlipEnum type;

    public PaymentSlip() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public TypePaymentSlipEnum getType() {
        return type;
    }

    public void setType(TypePaymentSlipEnum type) {
        this.type = type;
    }
}
