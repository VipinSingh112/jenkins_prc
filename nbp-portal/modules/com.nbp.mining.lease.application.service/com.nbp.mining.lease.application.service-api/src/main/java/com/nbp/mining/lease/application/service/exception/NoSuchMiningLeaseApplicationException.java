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
package com.nbp.mining.lease.application.service.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchMiningLeaseApplicationException extends NoSuchModelException {

	public NoSuchMiningLeaseApplicationException() {
	}

	public NoSuchMiningLeaseApplicationException(String msg) {
		super(msg);
	}

	public NoSuchMiningLeaseApplicationException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchMiningLeaseApplicationException(Throwable throwable) {
		super(throwable);
	}

}