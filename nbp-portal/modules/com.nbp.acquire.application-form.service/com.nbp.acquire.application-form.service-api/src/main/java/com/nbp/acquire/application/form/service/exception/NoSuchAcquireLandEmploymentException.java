/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.nbp.acquire.application.form.service.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchAcquireLandEmploymentException extends NoSuchModelException {

	public NoSuchAcquireLandEmploymentException() {
	}

	public NoSuchAcquireLandEmploymentException(String msg) {
		super(msg);
	}

	public NoSuchAcquireLandEmploymentException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchAcquireLandEmploymentException(Throwable throwable) {
		super(throwable);
	}

}