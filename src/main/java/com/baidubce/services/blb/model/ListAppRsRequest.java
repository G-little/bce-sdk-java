/*
 * Copyright (c) 2019 Baidu.com, Inc. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.blb.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.ListRequest;

/**
 * The request for list appBlb backendServer.
 */
public class ListAppRsRequest extends ListRequest {

    /**
     * the blb id of the backendServer
     */
    private String blbId;
    /**
     * the appServerGroup id of the backendServer
     */
    private String sgId;

    public String getSgId() {
        return sgId;
    }

    public void setSgId(String sgId) {
        this.sgId = sgId;
    }

    public ListAppRsRequest(String blbId) {
        this.blbId = blbId;
    }

    public String getBlbId() {
        return blbId;
    }

    public void setBlbId(String blbId) {
        this.blbId = blbId;
    }

    public ListAppRsRequest withBlbId(String blbId) {
        this.setBlbId(blbId);
        return this;
    }

    public ListAppRsRequest withSgId(String sgId) {
        this.setSgId(sgId);
        return this;
    }

    @Override
    public ListAppRsRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }
}
