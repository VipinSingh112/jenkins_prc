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

package com.nbp.sez.status.application.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusPaymentConfirmationException;
import com.nbp.sez.status.application.stage.services.model.SezStatusPaymentConfirmation;
import com.nbp.sez.status.application.stage.services.service.base.SezStatusPaymentConfirmationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.sez.status.application.stage.services.model.SezStatusPaymentConfirmation",
	service = AopService.class
)
public class SezStatusPaymentConfirmationLocalServiceImpl
	extends SezStatusPaymentConfirmationLocalServiceBaseImpl {
	public SezStatusPaymentConfirmation getSezStatusPaymentConfirmationBy_CI(String caseId) throws NoSuchSezStatusPaymentConfirmationException
			{
		return sezStatusPaymentConfirmationPersistence.findBygetPaymentConfirmationBy_CI(caseId);
	}
	public List<SezStatusPaymentConfirmation> getSezStatusPaymentConfirmationListBy_CI(String caseId){
		return sezStatusPaymentConfirmationPersistence.findBygetPaymentConfirmation_By_CI(caseId);
	}
	public SezStatusPaymentConfirmation updateSezStatusPaymentConfirmation(String caseId,Date dateReceived,String amountDue,String amountreceived,String receiptNumber,String comments,String amountOutstanding,Date dueDate ,String status) {
		SezStatusPaymentConfirmation confirmation=null;
			confirmation=sezStatusPaymentConfirmationPersistence.create(CounterLocalServiceUtil.increment());
			confirmation.setCaseId(caseId);
			confirmation.setDateReceived(dateReceived);
			confirmation.setAmountDue(amountDue);
			confirmation.setReceivedNumber(receiptNumber);
			confirmation.setAmountreceived(amountreceived);
			confirmation.setAmountOutstanding(amountOutstanding);
			confirmation.setDueDate(dueDate);
			confirmation.setStatus(status);
			confirmation.setComments(comments);
			sezStatusPaymentConfirmationPersistence.update(confirmation);
			return confirmation;
		}
}