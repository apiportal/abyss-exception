/*
 *
 *  *  Copyright (C) Verapi Yazilim Teknolojileri A.S. - All Rights Reserved
 *  *
 *  *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  *  Proprietary and confidential
 *  *
 *  *  Written by Halil Özkan <halil.ozkan@verapi.com>, 5 2018
 *
 */

package com.verapi.abyss.exception;

import io.vertx.core.VertxException;

abstract class AbyssException extends VertxException  {
    AbyssException(String message) {
        super(message);
    }

    AbyssException(String message, Throwable cause) {
        super(message, cause);
    }

    AbyssException(Throwable cause) {
        super(cause);
    }

    AbyssException(String message, boolean noStackTrace) {
        super(message, noStackTrace);
    }
}
