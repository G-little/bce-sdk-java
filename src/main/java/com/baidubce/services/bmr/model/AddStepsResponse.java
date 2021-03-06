/*
 * Copyright 2014 Baidu, Inc.
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
package com.baidubce.services.bmr.model;

import java.util.List;

import com.baidubce.model.AbstractBceResponse;

/**
 * Represent the response of AddStepsRequest.
 * <p>
 * The response contains a Array of IDs which are newly added steps.
 */
public class AddStepsResponse extends AbstractBceResponse {
    private List<String> stepIds;

    public List<String> getStepIds() {
        return stepIds;
    }

    public void setStepIds(List<String> stepIds) {
        this.stepIds = stepIds;
    }
}
