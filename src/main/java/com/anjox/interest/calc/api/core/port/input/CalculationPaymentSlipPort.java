package com.anjox.interest.calc.api.core.port.input;

import com.anjox.interest.calc.api.core.domain.PaymentSlipCalculed;

import java.time.LocalDate;

public interface CalculationPaymentSlipPort {
    PaymentSlipCalculed to_calculate(String code, LocalDate paymentDate);
}
