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

package com.nbp.fire.brigade.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadePaymentConfirmationException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation;
import com.nbp.fire.brigade.stage.service.service.FireBrigadePaymentConfirmationLocalServiceUtil;
import com.nbp.fire.brigade.stage.service.service.base.FireBrigadePaymentConfirmationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation", service = AopService.class)
public class FireBrigadePaymentConfirmationLocalServiceImpl extends FireBrigadePaymentConfirmationLocalServiceBaseImpl {
	public List<FireBrigadePaymentConfirmation> getFBA_PC_By_FBI(String caseId) {
		return fireBrigadePaymentConfirmationPersistence.findBygetFBA_PC_By_FBI(caseId);
	}

	public FireBrigadePaymentConfirmation getFireBrigadePaymentByCaseId(String caseId)
			throws NoSuchFireBrigadePaymentConfirmationException {
		return fireBrigadePaymentConfirmationPersistence.findBygetFireBrigadePaymentByCaseId(caseId);

	}

	public FireBrigadePaymentConfirmation updateFireBrigadePaymentConfirmation(String caseId, Date dateReceived,
			String amountDue, String amountReceived, String receiptNumber, String comment, String amountOutstanding,
			Date dueDate, String status) {
		FireBrigadePaymentConfirmation confirmation = null;
		confirmation = fireBrigadePaymentConfirmationPersistence.create(CounterLocalServiceUtil.increment());
		confirmation.setCaseId(caseId);
		confirmation.setDateReceived(dateReceived);
		confirmation.setAmountDue(amountDue);
		confirmation.setAmountReceived(amountReceived);
		confirmation.setReceiptNumber(receiptNumber);
		confirmation.setComment(comment);
		confirmation.setAmountOutstanding(amountOutstanding);
		confirmation.setDueDate(dueDate);
		confirmation.setStatus(status);
		fireBrigadePaymentConfirmationPersistence.update(confirmation);
		return confirmation;
	}
}