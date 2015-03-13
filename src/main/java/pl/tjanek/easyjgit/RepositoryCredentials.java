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
package pl.tjanek.easyjgit;

import com.google.common.base.Preconditions;

/**
 * Credentials to git repository
 * @author Tomasz Janek
 * @since 0.1.0
 */
public final class RepositoryCredentials {

    private final User user;
    private final String password;

    public RepositoryCredentials(User user, String password) {
        Preconditions.checkNotNull(user, "User can't be null!");
        this.user = user;
        this.password = password;
    }

    public String getUserName() {
        return user.getName();
    }

    public String getUserEmail() {
        return user.getEmail();
    }

    public String getPassword() {
        return password;
    }
}
