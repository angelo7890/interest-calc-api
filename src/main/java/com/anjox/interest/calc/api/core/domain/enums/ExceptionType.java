package com.anjox.interest.calc.api.core.domain.enums;

public enum ExceptionType {
    BOLETO_INVALIDO {
        @Override
        public String getMessageError() {
            return "Boleto invalido";
        }
    },
    TIPO_INVALIDO {
        @Override
        public String getMessageError() {
            return "Tipo do boleto invalido, verifique se e XPTO";
        }
    },
    BOLETO_NAO_VENCIDO {
        @Override
        public String getMessageError() {
            return "Impossivel calcular juros pois o boleto nao esta vencido";
        }
    };

    public abstract String getMessageError();
}
