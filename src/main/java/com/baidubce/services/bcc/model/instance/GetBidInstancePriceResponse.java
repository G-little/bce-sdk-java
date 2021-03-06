/*
 * Copyright (c) 2020 Baidu.com, Inc. All Rights Reserved
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
package com.baidubce.services.bcc.model.instance;

import com.baidubce.model.AbstractBceResponse;

/**
 * The response of getting bid instance price.
 */
public class GetBidInstancePriceResponse extends AbstractBceResponse {

    /**
     * The total money
     */
    private String money;

    /**
     * The count of purchase
     */
    private String count;

    /**
     * The unit-price
     */
    private String perMoney;

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPerMoney() {
        return perMoney;
    }

    public void setPerMoney(String perMoney) {
        this.perMoney = perMoney;
    }

    @Override
    public String toString() {
        return "BccPriceResponse{" +
                "money=" + money +
                ", count=" + count +
                ", perMoney=" + perMoney +
                '}';
    }
}
