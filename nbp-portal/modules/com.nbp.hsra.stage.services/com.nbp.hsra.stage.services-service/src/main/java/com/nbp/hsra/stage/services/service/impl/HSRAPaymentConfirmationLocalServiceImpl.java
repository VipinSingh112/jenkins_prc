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

package com.nbp.hsra.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.hsra.stage.services.exception.NoSuchHSRAPaymentConfirmationException;
import com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation;
import com.nbp.hsra.stage.services.service.base.HSRAPaymentConfirmationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation", service = AopService.class)
public class HSRAPaymentConfirmationLocalServiceImpl extends HSRAPaymentConfirmationLocalServiceBaseImpl {
	public HSRAPaymentConfirmation getHSRAPaymentConfirmationByCI(String caseId)
			throws NoSuchHSRAPaymentConfirmationException {
		return hsraPaymentConfirmationPersistence.findBygetPaymentConfirmationBy_CI(caseId);

	}

	public List<HSRAPaymentConfirmation> getHSRAPaymentConfirmations_List_By_CI(String caseId) {
		return hsraPaymentConfirmationPersistence.findBygetPaymentConfirmation_By_CI(caseId);
	}


	public HSRAPaymentConfirmation updateHSRAPaymentConfirmationData(String caseId, Date dateReceived, String amountDue,
			String amountreceived, String receiptNumber, String comments, String amountOutstanding, Date dueDate,
			String status) {
		HSRAPaymentConfirmation confirmation = null;

		confirmation = hsraPaymentConfirmationPersistence.create(CounterLocalServiceUtil.increment());
		confirmation.setCaseId(caseId);
		confirmation.setDateReceived(dateReceived);
		confirmation.setAmountDue(amountDue);
		confirmation.setReceivedNumber(receiptNumber);
		confirmation.setAmountreceived(amountreceived);
		confirmation.setAmountOutstanding(amountOutstanding);
		confirmation.setDueDate(dueDate);
		confirmation.setStatus(status);
		confirmation.setComments(comments);
		hsraPaymentConfirmationPersistence.update(confirmation);
		return confirmation;
	}
}