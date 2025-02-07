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

package com.nbp.factories.registration.application.form.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesAppPaymentException;
import com.nbp.factories.registration.application.form.services.model.FactoriesAppPayment;
import com.nbp.factories.registration.application.form.services.service.base.FactoriesAppPaymentLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.factories.registration.application.form.services.model.FactoriesAppPayment",
	service = AopService.class
)
public class FactoriesAppPaymentLocalServiceImpl
	extends FactoriesAppPaymentLocalServiceBaseImpl {
	public FactoriesAppPayment getFactoriesRegistrationById(long factoriesApplicationId) throws NoSuchFactoriesAppPaymentException {
		return factoriesAppPaymentPersistence.findBygetMiningById(factoriesApplicationId);
		
	}
}