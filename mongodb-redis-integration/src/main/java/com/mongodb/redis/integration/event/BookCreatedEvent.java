/*
 * Copyright 2015-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mongodb.redis.integration.event;

import com.mongodb.redis.integration.document.Book;

import org.springframework.context.ApplicationEvent;

public class BookCreatedEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public BookCreatedEvent(Book book) {
		super(book);
	}

}
