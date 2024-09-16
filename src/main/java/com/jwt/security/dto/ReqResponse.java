package com.jwt.security.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data

// the JsonIgnoreProperties Use Case: During deserialization (converting JSON into a Java object), if there are extra fields in the JSON that are not present in the ReqResponse class, they will be ignored instead of causing an error.
@JsonIgnoreProperties(ignoreUnknown = true)

@JsonInclude(JsonInclude.Include.NON_NULL)
// Purpose: This annotation specifies that during serialization (converting a Java object to JSON), only fields that are not null will be included in the output.
//Use Case: If certain fields in the ReqResponse object are null, they won’t be included in the JSON response.

public class ReqResponse {

    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;
    private String name;
    private String email;
    private String role;
    private String password;
    private List<Product> products;
    private String ourUsers;

}
