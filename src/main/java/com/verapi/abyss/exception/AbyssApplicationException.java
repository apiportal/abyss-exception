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

public class AbyssApplicationException extends RuntimeException {

    /**
     * Create an instance given a message
     *
     * @param message the message
     */
    AbyssApplicationException(String message) {
        super(message);
    }

    /**
     * Create an instance given a message and a cause
     *
     * @param message the message
     * @param cause   the cause
     */
    AbyssApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Create an instance given a cause
     *
     * @param cause the cause
     */
    AbyssApplicationException(Throwable cause) {
        super(cause);
    }

    /**
     * Create an instance given a message
     *
     * @param message      the message
     * @param noStackTrace disable stack trace capture
     */
    AbyssApplicationException(String message, boolean noStackTrace) {
        super(message, null, !noStackTrace, !noStackTrace);
    }

}
