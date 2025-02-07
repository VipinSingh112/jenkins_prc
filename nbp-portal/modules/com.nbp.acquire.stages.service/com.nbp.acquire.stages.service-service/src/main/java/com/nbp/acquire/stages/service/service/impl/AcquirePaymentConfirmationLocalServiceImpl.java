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

package com.nbp.acquire.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation;
import com.nbp.acquire.stages.service.service.base.AcquirePaymentConfirmationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.acquire.stages.service.model.AcquirePaymentConfirmation",
	service = AopService.class
)
public class AcquirePaymentConfirmationLocalServiceImpl
	extends AcquirePaymentConfirmationLocalServiceBaseImpl {
	public AcquirePaymentConfirmation getAcquirePaymentConfirmationById(String caseId) {
		return acquirePaymentConfirmationPersistence.fetchBygetAcquirePaymentConfirmationBy_CI(caseId);
	}
	public List<AcquirePaymentConfirmation> getAcquirePaymentConfirmations_By_CI(String caseId) {
		return acquirePaymentConfirmationPersistence.findBygetAcquirePaymentConfirmations_By_CI(caseId);
	}
	public AcquirePaymentConfirmation updateAcquirePaymentConfirmation(String caseId,Date dateReceived,String amountDue,
			String amountReceived,String receiptNumber,String comment,String amountOutstanding,Date dueDate
			,String status) {
		AcquirePaymentConfirmation confirmation=null;
	
			confirmation=acquirePaymentConfirmationPersistence.create(CounterLocalServiceUtil.increment());
			confirmation.setCaseId(caseId);
			confirmation.setDateReceived(dateReceived);
			confirmation.setAmountDue(amountDue);
			confirmation.setAmountReceived(amountReceived);
			confirmation.setReceiptNumber(receiptNumber);
			confirmation.setComment(comment);
			confirmation.setAmountOutstanding(amountOutstanding);
			confirmation.setDueDate(dueDate);
			confirmation.setStatus(status);
			acquirePaymentConfirmationPersistence.update(confirmation);
				return confirmation;
	}
}