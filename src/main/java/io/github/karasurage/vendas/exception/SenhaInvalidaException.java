package io.github.karasurage.vendas.exception;

public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException() {
        super("Senha inválida.");
    }
}
