package com.segments.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error {

        @JsonProperty("error")
        private ErrorInner error;

        @JsonProperty("error")
        public ErrorInner getError() {
            return error;
        }

        @JsonProperty("error")
        public void setError(ErrorInner error) {
            this.error = error;
        }

    }

