/*
 * Copyright 2019 Verapi Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.verapi.abyss.exception;

import io.netty.handler.codec.http.HttpResponseStatus;

import java.io.Serializable;

public class AbyssApiException extends AbstractAbyssException {
    private static final long serialVersionUID = -7738303243503016028L;

    private final ApiSchemaError apiSchemaError;

    // avaiable http statuses: http://www.restapitutorial.com/httpstatuscodes.html
    private final HttpStatus httpResponseStatus;

    public AbyssApiException(String message, HttpResponseStatus httpResponseStatus) {
        super(message);
        this.apiSchemaError = null;
        this.httpResponseStatus = new HttpStatus(httpResponseStatus);
    }

    public AbyssApiException(String message, Throwable cause, HttpResponseStatus httpResponseStatus) {
        super(message, cause);
        apiSchemaError = null;
        this.httpResponseStatus = new HttpStatus(httpResponseStatus);
    }

    public AbyssApiException(Throwable cause, HttpResponseStatus httpResponseStatus) {
        super(cause);
        apiSchemaError = null;
        this.httpResponseStatus = new HttpStatus(httpResponseStatus);
    }

    public AbyssApiException(String message, boolean noStackTrace, HttpResponseStatus httpResponseStatus) {
        super(message, noStackTrace);
        apiSchemaError = null;
        this.httpResponseStatus = new HttpStatus(httpResponseStatus);
    }

    public AbyssApiException(ApiSchemaError apiSchemaError, HttpResponseStatus httpResponseStatus) {
        super(apiSchemaError.getUsermessage());
        this.apiSchemaError = apiSchemaError.setCode(httpResponseStatus.code());
        this.httpResponseStatus = new HttpStatus(httpResponseStatus);
    }

    public ApiSchemaError getApiError() {
        return this.apiSchemaError;
    }

    public HttpResponseStatus getHttpResponseStatus() {
        return httpResponseStatus.getHttpResponseStatus();
    }

    public static class HttpStatus implements Serializable {
        private static final long serialVersionUID = 1885933514282965583L;

        private final int code;
        private final String reasonPhrase;

        HttpStatus(HttpResponseStatus httpResponseStatus) {
            code = httpResponseStatus.code();
            reasonPhrase = httpResponseStatus.reasonPhrase();
        }

        HttpResponseStatus getHttpResponseStatus() {
            return new HttpResponseStatus(this.code, this.reasonPhrase);
        }
    }
}

