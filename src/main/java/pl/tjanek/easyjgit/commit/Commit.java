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
package pl.tjanek.easyjgit.commit;

import org.joda.time.LocalDateTime;
import pl.tjanek.easyjgit.user.User;

/**
 * Commit info
 * @author Tomasz Janek
 * @since 0.1.0
 */
public final class Commit {

    private final String id;
    private final User author;
    private final User committer;
    private final LocalDateTime committed;
    private final String message;

    public Commit(String id, User author, User committer, LocalDateTime committed, String message) {
        this.id = id;
        this.author = author;
        this.committer = committer;
        this.committed = committed;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public User getCommitter() {
        return committer;
    }

    public LocalDateTime getCommitted() {
        return committed;
    }

    public String getMessage() {
        return message;
    }
}
