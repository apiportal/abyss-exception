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

public class UnAuthorized401Exception extends AbyssApiException {

    public UnAuthorized401Exception(String message) {
        super(message, HttpResponseStatus.UNAUTHORIZED);
    }

    public UnAuthorized401Exception(String message, Throwable cause) {
        super(message, cause, HttpResponseStatus.UNAUTHORIZED);
    }

    public UnAuthorized401Exception(Throwable cause) {
        super(cause, HttpResponseStatus.UNAUTHORIZED);
    }

    public UnAuthorized401Exception(String message, boolean noStackTrace) {
        super(message, noStackTrace, HttpResponseStatus.UNAUTHORIZED);
    }

    public UnAuthorized401Exception(ApiSchemaError apiSchemaError) {
        super(apiSchemaError, HttpResponseStatus.UNAUTHORIZED);
    }
}
