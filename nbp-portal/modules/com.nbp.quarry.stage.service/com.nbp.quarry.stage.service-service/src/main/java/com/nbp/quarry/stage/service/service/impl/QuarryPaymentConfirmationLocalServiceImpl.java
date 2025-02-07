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

package com.nbp.quarry.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.quarry.stage.service.exception.NoSuchQuarryPaymentConfirmationException;
import com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation;
import com.nbp.quarry.stage.service.service.base.QuarryPaymentConfirmationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation",
	service = AopService.class
)
public class QuarryPaymentConfirmationLocalServiceImpl
	extends QuarryPaymentConfirmationLocalServiceBaseImpl {
	
	public QuarryPaymentConfirmation getQuarryPaymentConfBy_CI(String caseId) throws NoSuchQuarryPaymentConfirmationException {
		return quarryPaymentConfirmationPersistence.findBygetQuarryPaymentConfBy_CI(caseId);
	}
	public List<QuarryPaymentConfirmation> findBygetQuarryPayConfBy_CI(String caseId) {
		return quarryPaymentConfirmationPersistence.findBygetQuarryPayConfBy_CI(caseId);
	}
	public QuarryPaymentConfirmation updateQuarryPaymentConfirmation(String caseId,Date dateReceived,String amountDue,
			String amountReceived,String receiptNumber,String comment,String amountOutstanding,Date dueDate
			,String status) {
		QuarryPaymentConfirmation confirmation = null;
			confirmation=quarryPaymentConfirmationPersistence.create(CounterLocalServiceUtil.increment());                      
			confirmation.setCaseId(caseId);
			confirmation.setDateReceived(dateReceived);
			confirmation.setAmountDue(amountDue);
			confirmation.setAmountReceived(amountReceived);
			confirmation.setReceiptNumber(receiptNumber);
			confirmation.setComment(comment);
			confirmation.setAmountOutstanding(amountOutstanding);
			confirmation.setDueDate(dueDate);
			confirmation.setStatus(status);
			quarryPaymentConfirmationPersistence.update(confirmation);
			return confirmation;
	}
}