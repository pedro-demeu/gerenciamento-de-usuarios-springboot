package com.gerenciadordeusuarios.services.exeptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public String getRequestURI() {
        return null;
    }
}
