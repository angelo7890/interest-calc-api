package com.anjox.interest.calc.api.core.exceptions;

import com.anjox.interest.calc.api.core.domain.enums.ExceptionType;

public class ApplicationExceptions extends RuntimeException{
    private ExceptionType exceptionType;

    public ApplicationExceptions(ExceptionType exceptionType) {
        super(exceptionType.getMessageError());
        this.exceptionType = exceptionType;
    }

    public ExceptionType getExceptionType() {
        return exceptionType;
    }
}
