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

package com.nbp.factories.registration.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.factories.registration.stage.services.exception.NoSuchFactoryPaymentVerificationException;
import com.nbp.factories.registration.stage.services.model.FactoryPaymentVerification;
import com.nbp.factories.registration.stage.services.service.base.FactoryPaymentVerificationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.factories.registration.stage.services.model.FactoryPaymentVerification",
	service = AopService.class
)
public class FactoryPaymentVerificationLocalServiceImpl
	extends FactoryPaymentVerificationLocalServiceBaseImpl {
	
	public FactoryPaymentVerification getFactoryPaymentConfBy_CI(String caseId) throws NoSuchFactoryPaymentVerificationException {
		return factoryPaymentVerificationPersistence.findBygetFactoryPaymentConfBy_CI(caseId);
	}
	public List<FactoryPaymentVerification> getFactoryPayConfBy_CI(String caseId) {
		return factoryPaymentVerificationPersistence.findBygetFactoryPayConfBy_CI(caseId);
	}
	public FactoryPaymentVerification updateFactoryPaymentVerification(String caseId,Date dateReceived,String amountDue,
			String amountReceived,String receiptNumber,String comment,String amountOutstanding,Date dueDate
			,String status) {
		FactoryPaymentVerification confirmation = null;
			confirmation=factoryPaymentVerificationPersistence.create(CounterLocalServiceUtil.increment());                      
			confirmation.setCaseId(caseId);
			confirmation.setDateReceived(dateReceived);
			confirmation.setAmountDue(amountDue);
			confirmation.setAmountReceived(amountReceived);
			confirmation.setReceiptNumber(receiptNumber);
			confirmation.setComment(comment);
			confirmation.setAmountOutstanding(amountOutstanding);
			confirmation.setDueDate(dueDate);
			confirmation.setStatus(status);
			factoryPaymentVerificationPersistence.update(confirmation);
			return confirmation;
	}
}