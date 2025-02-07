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

package com.nbp.osi.insolvency.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsolvencyPaymentConfirmationException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyPaymentConfirmation;
import com.nbp.osi.insolvency.stage.services.service.OsiInsolvencyPaymentConfirmationLocalServiceUtil;
import com.nbp.osi.insolvency.stage.services.service.base.OsiInsolvencyPaymentConfirmationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyPaymentConfirmation",
	service = AopService.class
)
public class OsiInsolvencyPaymentConfirmationLocalServiceImpl
	extends OsiInsolvencyPaymentConfirmationLocalServiceBaseImpl {
	public OsiInsolvencyPaymentConfirmation getPaymentConfirmationBy_CI(String caseId) throws NoSuchOsiInsolvencyPaymentConfirmationException {
		return osiInsolvencyPaymentConfirmationPersistence.findBygetOSIIRPaymentConfirmationBy_CI(caseId);
	}
	public List<OsiInsolvencyPaymentConfirmation> getPaymentConfirmations_By_CI(String caseId)  {
		return osiInsolvencyPaymentConfirmationPersistence.findBygetOSIIRPaymentConfirmations_By_CI(caseId);
	}
	public OsiInsolvencyPaymentConfirmation  updateFilmPaymentConfirmation(String caseId,Date dateReceived,String amountDue,
			String amountReceived,String receiptNumber,String comment,String amountOutstanding,Date dueDate
			,String status) {
		OsiInsolvencyPaymentConfirmation confirmation=null;
			confirmation=OsiInsolvencyPaymentConfirmationLocalServiceUtil.createOsiInsolvencyPaymentConfirmation(CounterLocalServiceUtil.increment());
			confirmation.setCaseId(caseId);
			confirmation.setDateReceived(dateReceived);
			confirmation.setAmountDue(amountDue);
			confirmation.setAmountReceived(amountReceived);
			confirmation.setReceiptNumber(receiptNumber);
			confirmation.setComment(comment);
			confirmation.setAmountOutstanding(amountOutstanding);
			confirmation.setDueDate(dueDate);
			confirmation.setStatus(status);
			OsiInsolvencyPaymentConfirmationLocalServiceUtil.updateOsiInsolvencyPaymentConfirmation(confirmation);
				return confirmation;
	}
}