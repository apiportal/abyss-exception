/*
 *
 *  * Licensed to the Apache Software Foundation (ASF) under one
 *  * or more contributor license agreements.  See the NOTICE file
 *  * distributed with this work for additional information
 *  * regarding copyright ownership.  The ASF licenses this file
 *  * to you under the Apache License, Version 2.0 (the
 *  * "License"); you may not use this file except in compliance
 *  * with the License.  You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an
 *  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  * KIND, either express or implied.  See the License for the
 *  * specific language governing permissions and limitations
 *  * under the License.
 *
 */

package com.verapi.abyss.exception;

import io.netty.handler.codec.http.HttpResponseStatus;

public class InternalServerError500Exception extends AbyssApiException {

    public InternalServerError500Exception(String message) {
        super(message);
        this.httpResponseStatus = HttpResponseStatus.INTERNAL_SERVER_ERROR;
    }

    public InternalServerError500Exception(String message, Throwable cause) {
        super(message, cause);
        this.httpResponseStatus = HttpResponseStatus.INTERNAL_SERVER_ERROR;
    }

    public InternalServerError500Exception(Throwable cause) {
        super(cause);
        this.httpResponseStatus = HttpResponseStatus.INTERNAL_SERVER_ERROR;
    }

    public InternalServerError500Exception(String message, boolean noStackTrace) {
        super(message, noStackTrace);
        this.httpResponseStatus = HttpResponseStatus.INTERNAL_SERVER_ERROR;
    }

    public InternalServerError500Exception(ApiSchemaError apiSchemaError) {
        super(apiSchemaError.toString());
        this.apiSchemaError = apiSchemaError;
        this.httpResponseStatus = HttpResponseStatus.INTERNAL_SERVER_ERROR;
        apiSchemaError.setCode(this.httpResponseStatus.code());
    }

    @Override
    public ApiSchemaError getApiError() {
        return (this.apiSchemaError == null) ? new ApiSchemaError() : this.apiSchemaError;
    }
}
