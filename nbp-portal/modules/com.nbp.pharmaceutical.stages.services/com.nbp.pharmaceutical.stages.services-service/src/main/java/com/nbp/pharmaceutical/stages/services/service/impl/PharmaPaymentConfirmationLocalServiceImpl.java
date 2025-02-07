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

package com.nbp.pharmaceutical.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaPaymentConfirmationException;
import com.nbp.pharmaceutical.stages.services.model.PharmaPaymentConfirmation;
import com.nbp.pharmaceutical.stages.services.service.base.PharmaPaymentConfirmationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.pharmaceutical.stages.services.model.PharmaPaymentConfirmation", service = AopService.class)
public class PharmaPaymentConfirmationLocalServiceImpl extends PharmaPaymentConfirmationLocalServiceBaseImpl {

	public PharmaPaymentConfirmation getPharmaPaymentConfirmationBy_CI(String caseId)
			throws NoSuchPharmaPaymentConfirmationException {
		return pharmaPaymentConfirmationPersistence.findBygetPaymentConfirmationBy_CI(caseId);
	}
	public List<PharmaPaymentConfirmation> getPharmaPaymentConfirmationBy_CId(String caseId){
		return pharmaPaymentConfirmationPersistence.findBygetPaymentConfirmation_By_CI(caseId);
	}
public PharmaPaymentConfirmation updatePharmaPaymentConfirmation(String caseId,Date dateReceived,String amountDue,String amountreceived,String receiptNumber,String comments) {
PharmaPaymentConfirmation confirmation=null;
	confirmation=pharmaPaymentConfirmationPersistence.create(CounterLocalServiceUtil.increment());
	confirmation.setDateReceived(dateReceived);
	confirmation.setAmountDue(amountDue);
	confirmation.setDateReceived(dateReceived);
	confirmation.setAmountDue(amountDue);
	confirmation.setReceivedNumber(receiptNumber);
	pharmaPaymentConfirmationPersistence.update(confirmation);
	return confirmation;
}
public PharmaPaymentConfirmation updatePharmaPaymentConfirmationData(String caseId,Date dateReceived,String amountDue,String amountreceived,String receiptNumber,String comments,String amountOutstanding,Date dueDate ,String status) {
	PharmaPaymentConfirmation confirmation=null;

		confirmation=pharmaPaymentConfirmationPersistence.create(CounterLocalServiceUtil.increment());
		confirmation.setCaseId(caseId);
		confirmation.setDateReceived(dateReceived);
		confirmation.setAmountDue(amountDue);
		confirmation.setReceivedNumber(receiptNumber);
		confirmation.setAmountreceived(amountreceived);
		confirmation.setAmountOutstanding(amountOutstanding);
		confirmation.setDueDate(dueDate);
		confirmation.setStatus(status);
		confirmation.setComments(comments);
		pharmaPaymentConfirmationPersistence.update(confirmation);
	return confirmation;
}
}
