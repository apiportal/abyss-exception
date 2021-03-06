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

import io.vertx.core.json.JsonObject;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

public class ApiSchemaError implements Serializable {
    private static final long serialVersionUID = 4473272139318642980L;

    private int code;
    private String usermessage;
    private String internalmessage;
    private String details;
    private String recommendation;
    private URL moreinfo;
    private String timestamp;
    private String path;

    public ApiSchemaError() {
        // no extra work need while instantiation
    }

    public ApiSchemaError setMoreinfoURLasString(String moreinfo) {
        try {
            this.moreinfo = new URL(moreinfo);
        } catch (MalformedURLException e) {
            this.moreinfo = null;
        }
        return this;
    }

    public JsonObject toJson() {
        return JsonObject.mapFrom(this);
    }

    public int getCode() {
        return code;
    }

    public ApiSchemaError setCode(int code) {
        this.code = code;
        return this;
    }

    public String getUsermessage() {
        return usermessage;
    }

    public ApiSchemaError setUsermessage(String usermessage) {
        this.usermessage = (usermessage == null) ? "null" : usermessage;
        return this;
    }

    public String getInternalmessage() {
        return internalmessage;
    }

    public ApiSchemaError setInternalmessage(String internalmessage) {
        this.internalmessage = (internalmessage == null) ? "null" : internalmessage;
        return this;
    }

    public String getDetails() {
        return details;
    }

    public ApiSchemaError setDetails(String details) {
        this.details = (details == null) ? "null" : details;
        return this;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public ApiSchemaError setRecommendation(String recommendation) {
        this.recommendation = (recommendation == null) ? "null" : recommendation;
        return this;
    }

    public URL getMoreinfo() {
        return moreinfo;
    }

    public ApiSchemaError setMoreinfo(URL moreinfo) {
        this.moreinfo = moreinfo;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public ApiSchemaError setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getPath() {
        return path;
    }

    public ApiSchemaError setPath(String path) {
        this.path = path;
        return this;
    }

}
