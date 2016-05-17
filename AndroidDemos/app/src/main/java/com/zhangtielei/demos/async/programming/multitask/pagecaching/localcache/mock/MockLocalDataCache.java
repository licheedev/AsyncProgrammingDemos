/*
 * Copyright (C) 2016 Tielei Zhang (zhangtielei.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zhangtielei.demos.async.programming.multitask.pagecaching.localcache.mock;

import com.zhangtielei.demos.async.programming.multitask.pagecaching.localcache.AsyncCallback;
import com.zhangtielei.demos.async.programming.multitask.pagecaching.localcache.LocalDataCache;
import com.zhangtielei.demos.async.programming.multitask.pagecaching.model.HttpResponse;

/**
 * Created by Tielei Zhang on 16/5/17.
 */
public class MockLocalDataCache implements LocalDataCache {
    @Override
    public void getCachingData(String key, AsyncCallback<HttpResponse> callback) {
        //TODO:
    }

    @Override
    public void saveCachingData(String key, HttpResponse data, AsyncCallback<Boolean> callback) {
        //TODO:
    }
}