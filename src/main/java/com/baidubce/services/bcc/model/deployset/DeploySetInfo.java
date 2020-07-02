/*
 * Copyright 2020 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.bcc.model.deployset;

import java.util.List;

/**
 * The information of the deploy set.
 */
public class DeploySetInfo {

    private String instanceCount;

    private String name;

    private String strategy;

    private String deploysetId;

    private String desc;

    private List<AzInstanceStatis> azIntstanceStatisList;

    public String getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(String instanceCount) {
        this.instanceCount = instanceCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getDeploysetId() {
        return deploysetId;
    }

    public void setDeploysetId(String deploysetId) {
        this.deploysetId = deploysetId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<AzInstanceStatis> getAzIntstanceStatisList() {
        return azIntstanceStatisList;
    }

    public void setAzIntstanceStatisList(List<AzInstanceStatis> azIntstanceStatisList) {
        this.azIntstanceStatisList = azIntstanceStatisList;
    }

    @Override
    public String toString() {
        return "DeploySetInfo{" +
                "instanceCount='" + instanceCount + '\'' +
                ", name='" + name + '\'' +
                ", strategy='" + strategy + '\'' +
                ", deploysetId='" + deploysetId + '\'' +
                ", desc='" + desc + '\'' +
                ", azIntstanceStatisList=" + azIntstanceStatisList +
                '}';
    }
}
