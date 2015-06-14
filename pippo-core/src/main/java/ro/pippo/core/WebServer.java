/*
 * Copyright (C) 2014 the original author or authors.
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
package ro.pippo.core;

/**
 * @author Decebal Suiu
 */
public interface WebServer<T extends WebServerSettings> {

    public T getSettings();

    public PippoFilter getPippoFilter();

    public void setPippoFilter(PippoFilter pippoFilter);

    public String getPippoFilterPath();

    public void setPippoFilterPath(String pippoFilterPath);

    public void init(PippoSettings pippoSettings);

    public void start();

    public void stop();

}
