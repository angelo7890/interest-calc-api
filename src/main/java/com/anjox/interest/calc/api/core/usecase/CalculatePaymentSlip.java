package com.anjox.interest.calc.api.core.usecase;

import com.anjox.interest.calc.api.core.domain.PaymentSlip;
import com.anjox.interest.calc.api.core.domain.PaymentSlipCalculed;
import com.anjox.interest.calc.api.core.domain.enums.ExceptionType;
import com.anjox.interest.calc.api.core.domain.enums.TypePaymentSlipEnum;
import com.anjox.interest.calc.api.core.exceptions.ApplicationExceptions;
import com.anjox.interest.calc.api.core.port.input.CalculationPaymentSlipPort;
import com.anjox.interest.calc.api.core.port.output.ComplementPaymentSlipPort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public class CalculatePaymentSlip implements CalculationPaymentSlipPort {

    private final ComplementPaymentSlipPort complementPaymentSlipPort;

    public CalculatePaymentSlip(ComplementPaymentSlipPort complementPaymentSlipPort) {
        this.complementPaymentSlipPort = complementPaymentSlipPort;
    }

    @Override
    public PaymentSlipCalculed to_calculate(String code, LocalDate paymentDate) {
        var paymentSlip = complementPaymentSlipPort.to_execute(code);
        validatePaymentSlip(paymentSlip);
    }


    private void validatePaymentSlip(PaymentSlip ps){
        if (ps==null){
            throw new ApplicationExceptions(ExceptionType.BOLETO_INVALIDO);
        }

        if(ps.getType() != TypePaymentSlipEnum.XPTO){
            throw new ApplicationExceptions(ExceptionType.BOLETO_INVALIDO);
        }

        if(ps.getDueDate().isAfter(LocalDate.now())){
            throw new ApplicationExceptions(ExceptionType.BOLETO_NAO_VENCIDO);
        }
    }
}
