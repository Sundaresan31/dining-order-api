package com.example.dio.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



/**
 * Utility class to build standardized API responses.
 * Provides methods to return success and error responses in a structured format.
 */
public class ResponseBuilder {

    /**
     * Builds a success response with a given HTTP status, message, and data.
     *
     * @param status  The HTTP status of the response.
     * @param message A message describing the response.
     * @param data    The response payload.
     * @param <T>     The type of data included in the response.
     * @return A {@link ResponseEntity} containing the response structure.
     */
    public static <T> ResponseEntity<ResponseStructure<T>> success(HttpStatus status, String message, T data) {
        ResponseStructure<T> structure = ResponseStructure.<T>builder()
                .status(status.value())
                .message(message)
                .data(data)
                .build();

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(structure);
    }

    /**
     * Builds a success response with a given HTTP status, headers, message, and data.
     *
     * @param status  The HTTP status of the response.
     * @param headers Additional HTTP headers to include in the response.
     * @param message A message describing the response.
     * @param data    The response payload.
     * @param <T>     The type of data included in the response.
     * @return A {@link ResponseEntity} containing the response structure with headers.
     */
    public static <T> ResponseEntity<ResponseStructure<T>> success(HttpStatus status, HttpHeaders headers, String message, T data) {
        ResponseStructure<T> structure = ResponseStructure.<T>builder()
                .status(status.value())
                .message(message)
                .data(data)
                .build();

        return ResponseEntity.status(HttpStatus.CREATED)
                .headers(headers)
                .body(structure);
    }

    /**
     * Builds an error response with a given HTTP status and message.
     *
     * @param status  The HTTP status of the response.
     * @param message A message describing the error.
     * @return A {@link ResponseEntity} containing the error response.
     */
    public static ResponseEntity<SimpleErrorResponse> error(HttpStatus status, String message) {
        SimpleErrorResponse error = SimpleErrorResponse.builder()
                .type(status.name())
                .message(message)
                .status(status.value())
                .build();

        return ResponseEntity.status(status)
                .body(error);
    }

    /**
     * Builds a 404 Not Found error response with a given message.
     *
     * @param message A message describing the missing resource.
     * @return A {@link ResponseEntity} with HTTP 404 status and error details.
     */
    public static ResponseEntity<SimpleErrorResponse> notFound(String message) {
        return error(HttpStatus.NOT_FOUND, message);
    }

    /**
     * Builds a success response with HTTP 200 OK status, a message, and data.
     *
     * @param message A message describing the response.
     * @param data    The response payload.
     * @param <T>     The type of data included in the response.
     * @return A {@link ResponseEntity} with HTTP 200 status.
     */
    public static <T> ResponseEntity<ResponseStructure<T>> ok(String message, T data) {
        return success(HttpStatus.OK, message, data);
    }

    /**
     * Builds a success response with HTTP 200 OK status, headers, a message, and data.
     *
     * @param headers Additional HTTP headers to include in the response.
     * @param message A message describing the response.
     * @param data    The response payload.
     * @param <T>     The type of data included in the response.
     * @return A {@link ResponseEntity} with HTTP 200 status and headers.
     */
    public static <T> ResponseEntity<ResponseStructure<T>> ok(HttpHeaders headers, String message, T data) {
        return success(HttpStatus.OK, headers, message, data);
    }





}
