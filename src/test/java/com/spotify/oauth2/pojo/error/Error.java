package com.spotify.oauth2.pojo.error;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {

    private InnerError error;

    public InnerError getError() {
        return error;
    }

    public void setError(InnerError error) {
        this.error = error;
    }
}
