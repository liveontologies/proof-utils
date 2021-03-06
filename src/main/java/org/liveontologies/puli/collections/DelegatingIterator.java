package org.liveontologies.puli.collections;

/*-
 * #%L
 * Proof Utility Library
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2014 - 2017 Live Ontologies Project
 * %%
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
 * #L%
 */

import java.util.Iterator;

public class DelegatingIterator<E> implements Iterator<E> {

	private final Iterator<E> delegate_;

	public DelegatingIterator(Iterator<E> delegate) {
		this.delegate_ = delegate;
	}

	public Iterator<E> getDelegate() {
		return delegate_;
	}

	@Override
	public boolean hasNext() {
		return delegate_.hasNext();
	}

	@Override
	public E next() {
		return delegate_.next();
	}

	@Override
	public void remove() {
		delegate_.remove();
	}

}
