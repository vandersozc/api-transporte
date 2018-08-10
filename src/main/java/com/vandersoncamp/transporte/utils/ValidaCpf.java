package com.vandersoncamp.transporte.utils;import br.com.caelum.stella.ValidationMessage;import br.com.caelum.stella.validation.CPFValidator;import org.springframework.stereotype.Component;import java.util.List;@Componentpublic class ValidaCpf {    private ValidaCpf() {    }    public static boolean valida(String cpf) {        CPFValidator cpfValidator = new CPFValidator();        List<ValidationMessage> erros = cpfValidator.invalidMessagesFor(cpf);        return erros.isEmpty();    }}