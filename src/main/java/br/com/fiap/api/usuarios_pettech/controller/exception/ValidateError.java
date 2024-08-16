package br.com.fiap.api.usuarios_pettech.controller.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidateError extends StandardError {
    private final List<ValidateMessage> messages = new ArrayList<ValidateMessage>();

    public List<ValidateMessage> getMessages() {
        return messages;
    }

    public void addMessages(String field, String message) {
        messages.add(new ValidateMessage(field, message));
    }
}
