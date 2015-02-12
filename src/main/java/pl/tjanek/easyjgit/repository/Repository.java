/*
 * Copyright 2012-2015 the original author or authors.
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
package pl.tjanek.easyjgit.repository;

import java.io.File;

/**
 * Repository info
 * @author Tomasz Janek
 * @since 0.1.0
 */
public final class Repository {

    private final String name;
    private final File location;

    public Repository(String name, File location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public File getLocation() {
        return location;
    }
}