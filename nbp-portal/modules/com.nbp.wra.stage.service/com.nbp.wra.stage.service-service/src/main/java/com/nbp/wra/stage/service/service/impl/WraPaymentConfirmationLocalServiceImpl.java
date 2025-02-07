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

package com.nbp.wra.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.wra.stage.service.exception.NoSuchWraPaymentConfirmationException;
import com.nbp.wra.stage.service.model.WraPaymentConfirmation;
import com.nbp.wra.stage.service.service.base.WraPaymentConfirmationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.wra.stage.service.model.WraPaymentConfirmation",
	service = AopService.class
)
public class WraPaymentConfirmationLocalServiceImpl
	extends WraPaymentConfirmationLocalServiceBaseImpl {
	 
		public WraPaymentConfirmation getWraPaymentConfBy_CI(String caseId) throws NoSuchWraPaymentConfirmationException {
			return wraPaymentConfirmationPersistence.findBygetWraPaymentConfBy_CI(caseId);
		}
		public List<WraPaymentConfirmation> getWraPayConfBy_CI(String caseId) {
			return wraPaymentConfirmationPersistence.findBygetWraPayConfBy_CI(caseId);
		}
		public WraPaymentConfirmation updateWraPaymentConfirmation(String caseId,Date dateReceived,String amountDue,
				String amountReceived,String receiptNumber,String comment,String amountOutstanding,Date dueDate
				,String status) {
			WraPaymentConfirmation confirmation=null;
				confirmation= wraPaymentConfirmationPersistence.create(CounterLocalServiceUtil.increment());                         
				confirmation.setCaseId(caseId);
				confirmation.setDateReceived(dateReceived);
				confirmation.setAmountDue(amountDue);
				confirmation.setAmountReceived(amountReceived);
				confirmation.setReceiptNumber(receiptNumber);
				confirmation.setComment(comment);
				confirmation.setAmountOutstanding(amountOutstanding);
				confirmation.setDueDate(dueDate);
				confirmation.setStatus(status);
				wraPaymentConfirmationPersistence.update(confirmation);
				return confirmation;
		}
		
}