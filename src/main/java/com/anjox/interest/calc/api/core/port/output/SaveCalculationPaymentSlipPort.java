package com.anjox.interest.calc.api.core.port.output;

import com.anjox.interest.calc.api.core.domain.PaymentSlipCalculed;

public interface SaveCalculationPaymentSlipPort {
    void to_save(PaymentSlipCalculed paymentSlip);
}
