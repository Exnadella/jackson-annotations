package com.fasterxml.jackson.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation used to define a human-readable description for a logical property.
 * Currently used to populate the description field in generated JSON Schemas.
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@JacksonAnnotation
public @interface JsonPropertyDescription
{
    /**
     * Defines a human-readable description of the logical property.
     * Currently used to populate the description field in generated JSON
     * Schemas.
     */
    String value() default "";
}
