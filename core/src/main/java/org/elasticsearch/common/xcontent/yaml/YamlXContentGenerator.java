/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.common.xcontent.yaml;

import com.fasterxml.jackson.core.JsonGenerator;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.common.xcontent.json.JsonXContentGenerator;

import java.io.OutputStream;

/**
 *
 */
public class YamlXContentGenerator extends JsonXContentGenerator {

    public YamlXContentGenerator(JsonGenerator jsonGenerator, OutputStream os, String... filters) {
        super(jsonGenerator, os, filters);
    }

    @Override
    public XContentType contentType() {
        return XContentType.YAML;
    }

    @Override
    public void usePrintLineFeedAtEnd() {
        // nothing here
    }

    @Override
    protected boolean supportsRawWrites() {
        return false;
    }
}
