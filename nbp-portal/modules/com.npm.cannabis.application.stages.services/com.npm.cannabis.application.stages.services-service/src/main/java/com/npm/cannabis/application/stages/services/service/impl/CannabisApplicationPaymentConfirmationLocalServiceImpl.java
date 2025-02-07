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

package com.npm.cannabis.application.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationPaymentConfirmation;
import com.npm.cannabis.application.stages.services.service.base.CannabisApplicationPaymentConfirmationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.npm.cannabis.application.stages.services.model.CannabisApplicationPaymentConfirmation", service = AopService.class)
public class CannabisApplicationPaymentConfirmationLocalServiceImpl
		extends CannabisApplicationPaymentConfirmationLocalServiceBaseImpl {
	public CannabisApplicationPaymentConfirmation getCannabisPaymentByCaseId(String caseId) {
		return cannabisApplicationPaymentConfirmationPersistence.fetchBygetCannabisPaymentByCaseId(caseId);
	}
  public List<CannabisApplicationPaymentConfirmation> getCA_PC_By_CI(String caseId){
	  return cannabisApplicationPaymentConfirmationPersistence.findBygetCA_PC_By_CI(caseId);
  }
	public CannabisApplicationPaymentConfirmation updateCannabisPaymentConfirmation(String caseId, Date dateReceived,
			String amountDue, String amountReceived, String receiptNumber, String comment, String amountOutstanding,
			Date dueDate, String status) {
		CannabisApplicationPaymentConfirmation confirmation = null;
		
			confirmation = cannabisApplicationPaymentConfirmationPersistence
					.create(CounterLocalServiceUtil.increment());
			confirmation.setCaseId(caseId);
			confirmation.setDateReceived(dateReceived);
			confirmation.setAmountDue(amountDue);
			confirmation.setAmountReceived(amountReceived);
			confirmation.setReceiptNumber(receiptNumber);
			confirmation.setComment(comment);
			confirmation.setAmountOutstanding(amountOutstanding);
			confirmation.setDueDate(dueDate);
			confirmation.setStatus(status);
			cannabisApplicationPaymentConfirmationPersistence.update(confirmation);
		return confirmation;
	}
}