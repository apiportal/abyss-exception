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

public class NotImplemented501Exception extends AbyssApiException {

    public NotImplemented501Exception(String message) {
        super(message);
        this.httpResponseStatus = HttpResponseStatus.NOT_IMPLEMENTED;
    }

    public NotImplemented501Exception(String message, Throwable cause) {
        super(message, cause);
        this.httpResponseStatus = HttpResponseStatus.NOT_IMPLEMENTED;
    }

    public NotImplemented501Exception(Throwable cause) {
        super(cause);
        this.httpResponseStatus = HttpResponseStatus.NOT_IMPLEMENTED;
    }

    public NotImplemented501Exception(String message, boolean noStackTrace) {
        super(message, noStackTrace);
        this.httpResponseStatus = HttpResponseStatus.NOT_IMPLEMENTED;
    }

    public NotImplemented501Exception(ApiSchemaError apiSchemaError) {
        super(apiSchemaError.toString());
        this.apiSchemaError = apiSchemaError;
        this.httpResponseStatus = HttpResponseStatus.NOT_IMPLEMENTED;
        apiSchemaError.setCode(this.httpResponseStatus.code());
    }

    @Override
    public ApiSchemaError getApiError() {
        return this.apiSchemaError;
    }
}