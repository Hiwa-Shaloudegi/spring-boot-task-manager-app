package dev.hiwa.itask.exceptions;


import java.util.UUID;

public class ResourceNotFoundException extends RuntimeException {
    String resourceName;
    String field;
    String fieldName;
    UUID fieldId;


    public ResourceNotFoundException(
            String resourceName, String field, String fieldName
    ) {
        super(String.format("%s not found with %s: %s", resourceName, field, fieldName));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldName = fieldName;
    }

    public ResourceNotFoundException(
            String resourceName, String field, UUID fieldId
    ) {
        super(String.format("%s not found with %s: %s", resourceName, field, fieldId.toString()));
        this.resourceName = resourceName;
        this.field = field;
        this.fieldId = fieldId;
    }


}
