/*
 * Copyright (C) 2016 ceabie (https://github.com/ceabie/)
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
package com.wj.dexknife;

import org.gradle.api.tasks.util.PatternSet;

import java.util.Set;

/**
 * The type Dex knife config.
 *
 * @author ceabie
 */
public class DexKnifeConfig {
    PatternSet patternSet;
    PatternSet suggestPatternSet;
    boolean useSuggest = true;
    boolean filterSuggest = false;
    boolean logMainList = false;
    boolean logFilterSuggest = false;
    Set<String> additionalParameters;
}
