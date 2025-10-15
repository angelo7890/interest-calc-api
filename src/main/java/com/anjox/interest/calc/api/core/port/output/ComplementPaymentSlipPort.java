package com.anjox.interest.calc.api.core.port.output;

import com.anjox.interest.calc.api.core.domain.PaymentSlip;

public interface ComplementPaymentSlipPort {

    PaymentSlip to_execute(String code);
}
